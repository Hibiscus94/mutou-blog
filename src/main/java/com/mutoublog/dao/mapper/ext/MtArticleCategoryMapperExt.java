package com.mutoublog.dao.mapper.ext;

import com.mutoublog.dao.entity.MtArticleCategory;
import com.mutoublog.dao.entity.MtArticleCategoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MtArticleCategoryMapperExt {

    /**
     * 动态条件搜索单条分类信息
     *
     * @param items   查询字段
     * @param example example
     * @return MtArticleCategory
     */
    MtArticleCategory selectSelectiveOne(@Param("items") String items, @Param("example") MtArticleCategoryExample example);

    /**
     * 动态条件搜索所有分类
     *
     * @param items   查询字段
     * @param example example
     * @return List<MtArticleCategory>
     */
    List<MtArticleCategory> selectSelective(@Param("items") String items, @Param("example") MtArticleCategoryExample example);
}