package com.mutoublog.service.Impl;

import com.mutoublog.dao.entity.MtBackground;
import com.mutoublog.dao.entity.MtBackgroundExample;
import com.mutoublog.dao.mapper.MtBackgroundMapper;
import com.mutoublog.dao.mapper.ext.MtBackgroundMapperExt;
import com.mutoublog.service.BackgroundService;
import com.mutoublog.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * com.mutoublog.service.Impl
 * Created by mutou on 2017/8/3.
 */
@Service
public class BackgroundServiceImpl implements BackgroundService {
    private static Logger log = LoggerFactory.getLogger(RedisUtil.class);

    @Autowired
    private MtBackgroundMapper mtBackgroundMapper;

    @Autowired
    private MtBackgroundMapperExt mtBackgroundMapperExt;

    @Override
    public MtBackground getBackgroundByClause(String items, MtBackground mtBackground) {
        if ("".equals(items)) {
            items = "*";
        }
        MtBackgroundExample example = new MtBackgroundExample();
        MtBackgroundExample.Criteria criteria = example.createCriteria();
        buildWhereClause(criteria, mtBackground);
        return mtBackgroundMapperExt.selectSelectiveOne(items, example);
    }

    @Override
    public List<MtBackground> getBackgroundsByClause(MtBackground mtBackground) {
        MtBackgroundExample example = new MtBackgroundExample();
        MtBackgroundExample.Criteria criteria = example.createCriteria();
        buildWhereClause(criteria, mtBackground);
        return mtBackgroundMapper.selectByExample(example);
    }

    @Override
    @Transactional
    public Integer updateBackground(MtBackground mtBackground) {
        MtBackgroundExample example = new MtBackgroundExample();
        MtBackgroundExample.Criteria criteria = example.createCriteria();
        buildWhereClause(criteria, mtBackground);
        return mtBackgroundMapper.updateByExampleSelective(mtBackground, example);
    }

    @Override
    @Transactional
    public Integer saveBackground(MtBackground mtBackground) {
        mtBackgroundMapper.insertSelective(mtBackground);
        return mtBackground.getId();
    }

    @Override
    @Transactional
    public Integer deleteBackgroundById(Integer id) {
        return mtBackgroundMapper.deleteByPrimaryKey(id);
    }

    private MtBackgroundExample.Criteria buildWhereClause(MtBackgroundExample.Criteria criteria, MtBackground mtBackground) {
        // 查询条件
        // id
        if (mtBackground.getId() != null && mtBackground.getId() > 0) {
            criteria.andIdEqualTo(mtBackground.getId());
        }
        // article_id
        if (mtBackground.getArticleId() != null && mtBackground.getArticleId() > 0) {
            criteria.andArticleIdEqualTo(mtBackground.getArticleId());
        }
        // cate_id
        if (mtBackground.getCateId() != null && mtBackground.getCateId() > 0) {
            criteria.andCateIdEqualTo(mtBackground.getCateId());
        }
        // nav_id
        if (mtBackground.getNavId() != null && mtBackground.getNavId() > 0) {
            criteria.andNavIdEqualTo(mtBackground.getNavId());
        }
        // tag_id
        if (mtBackground.getTagId() != null && mtBackground.getTagId() > 0) {
            criteria.andTagIdEqualTo(mtBackground.getTagId());
        }
        // status
        if (mtBackground.getStatus() != null) {
            criteria.andStatusEqualTo(mtBackground.getStatus());
        }
        return criteria;
    }
}