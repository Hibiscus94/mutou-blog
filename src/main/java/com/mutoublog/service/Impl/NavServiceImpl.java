package com.mutoublog.service.Impl;

import com.mutoublog.dao.entity.MtNav;
import com.mutoublog.dao.entity.MtNavExample;
import com.mutoublog.dao.mapper.MtNavMapper;
import com.mutoublog.dao.mapper.ext.MtNavMapperExt;
import com.mutoublog.service.NavService;
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
public class NavServiceImpl implements NavService {
    private static Logger log = LoggerFactory.getLogger(RedisUtil.class);

    @Autowired
    private MtNavMapper mtNavMapper;
    @Autowired
    private MtNavMapperExt mtNavMapperExt;

    @Override
    public MtNav getNavInfo(MtNav mtNav) {
        try {
            MtNavExample mtNavExample = new MtNavExample();
            MtNavExample.Criteria criteria = mtNavExample.createCriteria();
            buildWhereClause(criteria, mtNav);
            return mtNavMapperExt.selectOne(mtNavExample);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<MtNav> getAllNavInfo(MtNav mtNav) {
        try {
            MtNavExample mtNavExample = new MtNavExample();
            MtNavExample.Criteria criteria = mtNavExample.createCriteria();
            buildWhereClause(criteria, mtNav);
            mtNavExample.setOrderByClause("sort ASC,id DESC");
            return mtNavMapper.selectByExample(mtNavExample);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    @Transactional
    public Integer updateNav(MtNav mtNav) {
        try {
            return mtNavMapper.updateByPrimaryKeySelective(mtNav);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    @Transactional
    public Integer saveNav(MtNav mtNav) {
        try {
            mtNavMapper.insertSelective(mtNav);
            return (int) mtNav.getId();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    @Transactional
    public Integer deleteNavById(Byte id) {
        try {
            return mtNavMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            return 0;
        }
    }

    private MtNavExample.Criteria buildWhereClause(MtNavExample.Criteria criteria, MtNav mtNav) {
        // 查询条件
        // id
        if (mtNav.getId() != null && mtNav.getId() > 0) {
            criteria.andIdEqualTo(mtNav.getId());
        }
        // parent_id
        if (mtNav.getParentId() != null && mtNav.getParentId() > 0) {
            criteria.andParentIdEqualTo(mtNav.getParentId());
        }
        // cate_id
        if (mtNav.getCateId() != null && mtNav.getCateId() > 0) {
            criteria.andCateIdEqualTo(mtNav.getCateId());
        }
        // alias
        if (mtNav.getAlias() != null && !"".equals(mtNav.getAlias())) {
            criteria.andAliasEqualTo(mtNav.getAlias());
        }
        // status
        if (mtNav.getStatus() != null) {
            criteria.andStatusEqualTo(mtNav.getStatus());
        }
        return criteria;
    }
}