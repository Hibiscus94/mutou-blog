package com.mutoublog.dao.mapper.ext;

import com.mutoublog.dao.entity.MtArticle;
import com.mutoublog.dao.entity.MtArticleExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MtArticleMapperExt {
    MtArticle selectSelective(@Param("items") String items, @Param("example") MtArticleExample example);
}