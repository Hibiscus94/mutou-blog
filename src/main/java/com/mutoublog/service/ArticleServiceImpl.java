package com.mutoublog.service;

import com.mutoublog.dao.entity.MtArticle;
import com.mutoublog.dao.entity.MtArticleExample;
import com.mutoublog.dao.mapper.MtArticleMapper;
import com.mutoublog.utils.DateUtil;
import com.mutoublog.utils.MtStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * com.mutoublog.service
 * Created by mutou on 2017/6/28.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private MtArticleMapper mtArticleMapper;

    @Override
    public MtArticle getArticleByClause(Map clause) {
        return null;
    }

    @Override
    public List<MtArticle> getArticlesByClause(Map clause) {
        if (clause.isEmpty()) {
            return null;
        }
        try {
            MtArticleExample mtArticleExample = new MtArticleExample();
            MtArticleExample.Criteria criteria = mtArticleExample.createCriteria();

            // 查询条件
            // uid
            if (clause.containsKey("uid")){
                Integer uid = Integer.parseInt(clause.get("uid").toString());
                if (uid > 0) {
                    criteria.andUidEqualTo(uid);
                }
            }
            // cate_id
            if (clause.containsKey("cate_id")){
                Byte cateId = Byte.parseByte(clause.get("cate_id").toString());
                if (cateId > 0) {
                    criteria.andCateIdEqualTo(cateId);
                }
            }
            // is_top
            if (clause.containsKey("is_top")){
                byte isTop = Byte.parseByte(clause.get("is_top").toString());
                if (isTop > 0) {
                    criteria.andIsTopEqualTo(isTop);
                }
            }
            // create_date
            if (clause.containsKey("create_date")){
                Date createDate = DateUtil.stringToDate(clause.get("create_date").toString());
                if (createDate != null) {
                    criteria.andCreateDateEqualTo(createDate);
                }
            }
            // 排序
            String order = "";
            if (clause.containsKey("order")){
                order = clause.get("order").toString();
            }
            if (MtStringUtils.isEmpty(order)){
                order = "id DESC";
            }
            mtArticleExample.setOrderByClause(order);
            return mtArticleMapper.selectByExample(mtArticleExample);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    @Transactional
    public Integer updateArticleById(MtArticle mtArticle) {
        int articleId = mtArticle.getId();
        if (articleId <= 0) {
            return null;
        }
        try {
            MtArticleExample mtArticleExample = new MtArticleExample();
            MtArticleExample.Criteria criteria = mtArticleExample.createCriteria();
            criteria.andIdEqualTo(articleId);
            return mtArticleMapper.updateByExampleSelective(mtArticle, mtArticleExample);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    @Transactional
    public Integer saveArticle(MtArticle mtArticle) {
        try {
            mtArticleMapper.insertSelective(mtArticle);
            return mtArticle.getId();
        } catch (Exception e) {
            e.printStackTrace();
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
            e.printStackTrace();
            return 0;
        }
    }
}