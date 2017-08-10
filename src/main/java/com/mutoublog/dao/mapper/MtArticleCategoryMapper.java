package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtArticleCategory;
import com.mutoublog.dao.entity.MtArticleCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MtArticleCategoryMapper {
    long countByExample(MtArticleCategoryExample example);

    int deleteByExample(MtArticleCategoryExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(MtArticleCategory record);

    int insertSelective(MtArticleCategory record);

    List<MtArticleCategory> selectByExample(MtArticleCategoryExample example);

    MtArticleCategory selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") MtArticleCategory record, @Param("example") MtArticleCategoryExample example);

    int updateByExample(@Param("record") MtArticleCategory record, @Param("example") MtArticleCategoryExample example);

    int updateByPrimaryKeySelective(MtArticleCategory record);

    int updateByPrimaryKey(MtArticleCategory record);
}