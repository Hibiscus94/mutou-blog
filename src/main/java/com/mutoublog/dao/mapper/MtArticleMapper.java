package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtArticle;
import com.mutoublog.dao.entity.MtArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MtArticleMapper {
    long countByExample(MtArticleExample example);

    int deleteByExample(MtArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtArticle record);

    int insertSelective(MtArticle record);

    List<MtArticle> selectByExampleWithBLOBs(MtArticleExample example);

    List<MtArticle> selectByExample(MtArticleExample example);

    MtArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MtArticle record, @Param("example") MtArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") MtArticle record, @Param("example") MtArticleExample example);

    int updateByExample(@Param("record") MtArticle record, @Param("example") MtArticleExample example);

    int updateByPrimaryKeySelective(MtArticle record);

    int updateByPrimaryKeyWithBLOBs(MtArticle record);

    int updateByPrimaryKey(MtArticle record);
}