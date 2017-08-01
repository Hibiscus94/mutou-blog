package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtTag;
import com.mutoublog.dao.entity.MtTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtTagMapper {
    long countByExample(MtTagExample example);

    int deleteByExample(MtTagExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(MtTag record);

    int insertSelective(MtTag record);

    List<MtTag> selectByExample(MtTagExample example);

    MtTag selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") MtTag record, @Param("example") MtTagExample example);

    int updateByExample(@Param("record") MtTag record, @Param("example") MtTagExample example);

    int updateByPrimaryKeySelective(MtTag record);

    int updateByPrimaryKey(MtTag record);
}