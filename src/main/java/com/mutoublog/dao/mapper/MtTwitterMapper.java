package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtTwitter;
import com.mutoublog.dao.entity.MtTwitterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtTwitterMapper {
    long countByExample(MtTwitterExample example);

    int deleteByExample(MtTwitterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtTwitter record);

    int insertSelective(MtTwitter record);

    List<MtTwitter> selectByExample(MtTwitterExample example);

    MtTwitter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MtTwitter record, @Param("example") MtTwitterExample example);

    int updateByExample(@Param("record") MtTwitter record, @Param("example") MtTwitterExample example);

    int updateByPrimaryKeySelective(MtTwitter record);

    int updateByPrimaryKey(MtTwitter record);
}