package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtConfig;
import com.mutoublog.dao.entity.MtConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtConfigMapper {
    long countByExample(MtConfigExample example);

    int deleteByExample(MtConfigExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(MtConfig record);

    int insertSelective(MtConfig record);

    List<MtConfig> selectByExampleWithBLOBs(MtConfigExample example);

    List<MtConfig> selectByExample(MtConfigExample example);

    MtConfig selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") MtConfig record, @Param("example") MtConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") MtConfig record, @Param("example") MtConfigExample example);

    int updateByExample(@Param("record") MtConfig record, @Param("example") MtConfigExample example);

    int updateByPrimaryKeySelective(MtConfig record);

    int updateByPrimaryKeyWithBLOBs(MtConfig record);

    int updateByPrimaryKey(MtConfig record);
}