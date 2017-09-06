package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtArticleContent;
import com.mutoublog.dao.entity.MtArticleContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtArticleContentMapper {
    long countByExample(MtArticleContentExample example);

    int deleteByExample(MtArticleContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtArticleContent record);

    int insertSelective(MtArticleContent record);

    List<MtArticleContent> selectByExampleWithBLOBs(MtArticleContentExample example);

    List<MtArticleContent> selectByExample(MtArticleContentExample example);

    MtArticleContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MtArticleContent record, @Param("example") MtArticleContentExample example);

    int updateByExampleWithBLOBs(@Param("record") MtArticleContent record, @Param("example") MtArticleContentExample example);

    int updateByExample(@Param("record") MtArticleContent record, @Param("example") MtArticleContentExample example);

    int updateByPrimaryKeySelective(MtArticleContent record);

    int updateByPrimaryKeyWithBLOBs(MtArticleContent record);
}