package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtUser;
import com.mutoublog.dao.entity.MtUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MtUserMapper {
    long countByExample(MtUserExample example);

    int deleteByExample(MtUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MtUser record);

    int insertSelective(MtUser record);

    List<MtUser> selectByExample(MtUserExample example);

    MtUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MtUser record, @Param("example") MtUserExample example);

    int updateByExample(@Param("record") MtUser record, @Param("example") MtUserExample example);

    int updateByPrimaryKeySelective(MtUser record);

    int updateByPrimaryKey(MtUser record);

    MtUser selectByUser(String userName);
}