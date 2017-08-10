package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtBackground;
import com.mutoublog.dao.entity.MtBackgroundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MtBackgroundMapper {
    long countByExample(MtBackgroundExample example);

    int deleteByExample(MtBackgroundExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtBackground record);

    int insertSelective(MtBackground record);

    List<MtBackground> selectByExample(MtBackgroundExample example);

    MtBackground selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MtBackground record, @Param("example") MtBackgroundExample example);

    int updateByExample(@Param("record") MtBackground record, @Param("example") MtBackgroundExample example);

    int updateByPrimaryKeySelective(MtBackground record);

    int updateByPrimaryKey(MtBackground record);
}