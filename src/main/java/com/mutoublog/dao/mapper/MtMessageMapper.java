package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtMessage;
import com.mutoublog.dao.entity.MtMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtMessageMapper {
    long countByExample(MtMessageExample example);

    int deleteByExample(MtMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtMessage record);

    int insertSelective(MtMessage record);

    List<MtMessage> selectByExampleWithBLOBs(MtMessageExample example);

    List<MtMessage> selectByExample(MtMessageExample example);

    MtMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MtMessage record, @Param("example") MtMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") MtMessage record, @Param("example") MtMessageExample example);

    int updateByExample(@Param("record") MtMessage record, @Param("example") MtMessageExample example);

    int updateByPrimaryKeySelective(MtMessage record);

    int updateByPrimaryKeyWithBLOBs(MtMessage record);

    int updateByPrimaryKey(MtMessage record);
}