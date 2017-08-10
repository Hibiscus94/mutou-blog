package com.mutoublog.dao.mapper.ext;

import com.mutoublog.dao.entity.MtNav;
import com.mutoublog.dao.entity.MtNavExample;
import org.springframework.stereotype.Repository;

@Repository
public interface MtNavMapperExt {
    MtNav selectOne(MtNavExample example);
}