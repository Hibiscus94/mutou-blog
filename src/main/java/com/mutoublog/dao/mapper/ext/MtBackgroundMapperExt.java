package com.mutoublog.dao.mapper.ext;

import com.mutoublog.dao.entity.MtBackground;
import com.mutoublog.dao.entity.MtBackgroundExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface MtBackgroundMapperExt {
    /**
     * 动态条件搜索单条分类信息
     */
    MtBackground selectSelectiveOne(@Param("items") String items, @Param("example") MtBackgroundExample example);
}