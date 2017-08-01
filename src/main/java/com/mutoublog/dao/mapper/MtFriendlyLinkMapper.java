package com.mutoublog.dao.mapper;

import com.mutoublog.dao.entity.MtFriendlyLink;
import com.mutoublog.dao.entity.MtFriendlyLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtFriendlyLinkMapper {
    long countByExample(MtFriendlyLinkExample example);

    int deleteByExample(MtFriendlyLinkExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(MtFriendlyLink record);

    int insertSelective(MtFriendlyLink record);

    List<MtFriendlyLink> selectByExample(MtFriendlyLinkExample example);

    MtFriendlyLink selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") MtFriendlyLink record, @Param("example") MtFriendlyLinkExample example);

    int updateByExample(@Param("record") MtFriendlyLink record, @Param("example") MtFriendlyLinkExample example);

    int updateByPrimaryKeySelective(MtFriendlyLink record);

    int updateByPrimaryKey(MtFriendlyLink record);
}