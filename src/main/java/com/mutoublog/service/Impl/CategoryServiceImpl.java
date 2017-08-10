package com.mutoublog.service.Impl;

import com.mutoublog.dao.entity.MtArticleCategory;
import com.mutoublog.dao.entity.MtArticleCategoryExample;
import com.mutoublog.dao.mapper.MtArticleCategoryMapper;
import com.mutoublog.dao.mapper.ext.MtArticleCategoryMapperExt;
import com.mutoublog.service.CategoryService;
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
public class CategoryServiceImpl implements CategoryService {
    private static Logger log = LoggerFactory.getLogger(RedisUtil.class);

    @Autowired
    MtArticleCategoryMapper mtArticleCategoryMapper;
    @Autowired
    MtArticleCategoryMapperExt mtArticleCategoryMapperExt;

    /**
     * @param items             查询字段
     * @param mtArticleCategory category
     * @return MtArticleCategory
     */
    @Override
    public MtArticleCategory getCategoryByClause(String items, MtArticleCategory mtArticleCategory) {
        if ("".equals(items)) {
            items = "*";
        }
        MtArticleCategoryExample mtArticleCategoryExample = new MtArticleCategoryExample();
        MtArticleCategoryExample.Criteria criteria = mtArticleCategoryExample.createCriteria();
        buildWhereClause(criteria, mtArticleCategory);
        return mtArticleCategoryMapperExt.selectSelectiveOne(items, mtArticleCategoryExample);
    }

    /**
     * 获取所有分类信息
     *
     * @param items             查询字段
     * @param mtArticleCategory category
     * @return List<MtArticleCategory>
     */
    @Override
    public List<MtArticleCategory> getCategorysByClause(String items, MtArticleCategory mtArticleCategory) {
        if ("".equals(items)){
            items = "";
        }
        MtArticleCategoryExample mtArticleCategoryExample = new MtArticleCategoryExample();
        MtArticleCategoryExample.Criteria criteria = mtArticleCategoryExample.createCriteria();
        buildWhereClause(criteria,mtArticleCategory);
        return mtArticleCategoryMapperExt.selectSelective(items,mtArticleCategoryExample);
    }

    /**
     * 更新分类信息
     *
     * @param mtArticleCategory category
     * @return int
     */
    @Override
    @Transactional
    public Integer updateCategoryById(MtArticleCategory mtArticleCategory) {
        return mtArticleCategoryMapper.updateByPrimaryKeySelective(mtArticleCategory);
    }

    /**
     * 添加分类
     *
     * @param mtArticleCategory category
     * @return int
     */
    @Override
    @Transactional
    public Integer saveCategory(MtArticleCategory mtArticleCategory) {
        mtArticleCategoryMapper.insertSelective(mtArticleCategory);
        return (int) mtArticleCategory.getId();
    }

    /**
     * 根据id 删除分类
     *
     * @param cateId cateId
     * @return int
     */
    @Override
    @Transactional
    public Integer deleteCategoryById(Byte cateId) {
        return mtArticleCategoryMapper.deleteByPrimaryKey(cateId);
    }

    private MtArticleCategoryExample.Criteria buildWhereClause(MtArticleCategoryExample.Criteria criteria, MtArticleCategory mtArticleCategory) {
        // 查询条件
        // id
        if (mtArticleCategory.getId() != null && mtArticleCategory.getId() > 0) {
            criteria.andIdEqualTo(mtArticleCategory.getId());
        }
        // name
        if (mtArticleCategory.getName() != null && !"".equals(mtArticleCategory.getName())) {
            criteria.andNameEqualTo(mtArticleCategory.getName());
        }
        // parent_id
        if (mtArticleCategory.getParentId() != null) {
            criteria.andParentIdEqualTo(mtArticleCategory.getParentId());
        }
        // status
        if (mtArticleCategory.getStatus() != null) {
            criteria.andStatusEqualTo(mtArticleCategory.getStatus());
        }

        return criteria;
    }
}