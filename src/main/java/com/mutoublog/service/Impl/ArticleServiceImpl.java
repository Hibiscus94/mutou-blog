package com.mutoublog.service.Impl;

import com.mutoublog.dao.entity.MtArticle;
import com.mutoublog.dao.entity.MtArticleExample;
import com.mutoublog.dao.mapper.MtArticleMapper;
import com.mutoublog.dao.mapper.ext.MtArticleMapperExt;
import com.mutoublog.service.ArticleService;
import com.mutoublog.utils.MtStringUtils;
import com.mutoublog.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * com.mutoublog.service
 * Created by mutou on 2017/6/28.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    private static Logger log = LoggerFactory.getLogger(RedisUtil.class);
    @Autowired
    private MtArticleMapper mtArticleMapper;
    @Autowired
    private MtArticleMapperExt mtArticleMapperExt;

    @Override
    public MtArticle getArticleByClause(String items, MtArticle mtArticle) {
        if ("".equals(items)) {
            items = "*";
        }
        MtArticleExample mtArticleExample = new MtArticleExample();
        MtArticleExample.Criteria criteria = mtArticleExample.createCriteria();
        buildWhereClause(criteria, mtArticle);
        return mtArticleMapperExt.selectSelective(items, mtArticleExample);
    }

    @Override
    public List<MtArticle> getArticlesByClause(Map<String, Object> clause, MtArticle mtArticle) {
        if (clause.isEmpty()) {
            return null;
        }
        try {
            MtArticleExample mtArticleExample = new MtArticleExample();
            MtArticleExample.Criteria criteria = mtArticleExample.createCriteria();
            buildWhereClause(criteria, mtArticle);
            // 排序
            String order = "";
            if (clause.containsKey("order")) {
                order = clause.get("order").toString();
            }
            if (MtStringUtils.isEmpty(order)) {
                order = "sort ASC,id DESC";
            }
            mtArticleExample.setOrderByClause(order);
            return mtArticleMapper.selectByExample(mtArticleExample);
        } catch (Exception e) {
            log.error("获取文章信息失败！");
            return null;
        }
    }

    @Override
    @Transactional
    public Integer updateArticleById(MtArticle mtArticle) {
        int articleId = mtArticle.getId();
        if (articleId <= 0) {
            return 0;
        }
        try {
            MtArticleExample mtArticleExample = new MtArticleExample();
            MtArticleExample.Criteria criteria = mtArticleExample.createCriteria();
            criteria.andIdEqualTo(articleId);
            return mtArticleMapper.updateByExampleSelective(mtArticle, mtArticleExample);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    @Transactional
    public Integer saveArticle(MtArticle mtArticle) {
        try {
            mtArticleMapper.insertSelective(mtArticle);
            return mtArticle.getId();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    @Transactional
    public Integer deleteArticle(Integer articleId) {
        if (articleId <= 0) {
            return 0;
        }
        try {
            return mtArticleMapper.deleteByPrimaryKey(articleId);
        } catch (Exception e) {
            return 0;
        }
    }

    private MtArticleExample.Criteria buildWhereClause(MtArticleExample.Criteria criteria, MtArticle mtArticle) {
        // 查询条件
        // uid
        if (mtArticle.getUid() != null && mtArticle.getUid() > 0) {
            criteria.andUidEqualTo(mtArticle.getUid());
        }
        // cate_id
        if (mtArticle.getCateId() != null && mtArticle.getCateId() > 0) {
            criteria.andCateIdEqualTo(mtArticle.getCateId());
        }
        // is_top
        if (mtArticle.getIsTop() != null) {
            criteria.andIsTopEqualTo(mtArticle.getIsTop());
        }
        // create_date
        if (mtArticle.getCreateDate() != null) {
            criteria.andCreateDateEqualTo(mtArticle.getCreateDate());
        }
        // title
        if (mtArticle.getTitle() != null && !"".equals(mtArticle.getTitle())) {
            criteria.andTitleEqualTo(mtArticle.getTitle());
        }
        // id
        if (mtArticle.getId() != null && mtArticle.getId() > 0) {
            criteria.andIdEqualTo(mtArticle.getId());
        }
        // status
        if (mtArticle.getStatus() != null) {
            criteria.andStatusEqualTo(mtArticle.getStatus());
        }

        return criteria;
    }
}