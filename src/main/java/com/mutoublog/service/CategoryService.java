package com.mutoublog.service;

import com.mutoublog.dao.entity.MtArticleCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * com.mutoublog.service
 * Created by mutou on 2017/8/3.
 */
@Repository
public interface CategoryService {
    /**
     * 根据类目id查询分类信息
     */
    MtArticleCategory getCategoryByClause(String items, MtArticleCategory mtArticleCategory);

    /**
     * 根据条件查询所有分类信息
     */
    List<MtArticleCategory> getCategorysByClause(String items, MtArticleCategory mtArticleCategory);

    /**
     * 根据分类id更新分类信息
     */
    Integer updateCategoryById(MtArticleCategory mtArticleCategory);

    /**
     * 保存分类信息
     */
    Integer saveCategory(MtArticleCategory mtArticleCategory);

    /**
     * 根据分类id删除分类
     */
    Integer deleteCategoryById(Byte cateId);
}