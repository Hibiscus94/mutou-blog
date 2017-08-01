package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtBind;
import com.mutoublog.dao.entity.MtBindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtBindMapper {
    long countByExample(MtBindExample example);

    int deleteByExample(MtBindExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtBind record);

    int insertSelective(MtBind record);

    List<MtBind> selectByExample(MtBindExample example);

    MtBind selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MtBind record, @Param("example") MtBindExample example);

    int updateByExample(@Param("record") MtBind record, @Param("example") MtBindExample example);

    int updateByPrimaryKeySelective(MtBind record);

    int updateByPrimaryKey(MtBind record);
}