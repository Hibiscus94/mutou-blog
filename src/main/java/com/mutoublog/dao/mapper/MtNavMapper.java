package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtNav;
import com.mutoublog.dao.entity.MtNavExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtNavMapper {
    long countByExample(MtNavExample example);

    int deleteByExample(MtNavExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(MtNav record);

    int insertSelective(MtNav record);

    List<MtNav> selectByExample(MtNavExample example);

    MtNav selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") MtNav record, @Param("example") MtNavExample example);

    int updateByExample(@Param("record") MtNav record, @Param("example") MtNavExample example);

    int updateByPrimaryKeySelective(MtNav record);

    int updateByPrimaryKey(MtNav record);
}