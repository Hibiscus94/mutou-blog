package com.mutoublog.service;

import com.mutoublog.dao.entity.MtArticle;

import java.util.List;
import java.util.Map;

/**
 * com.mutoublog.service
 * Created by mutou on 2017/6/28.
 */
public interface ArticleService {
    /**
     * 根据查询条件返回单条文章信息
     *
     * @param clause
     * @return
     */
    MtArticle getArticleByClause(Map clause);

    /**
     * 根据查询条件返回多条文章信息
     *
     * @param clause
     * @return
     */
    List<MtArticle> getArticlesByClause(Map clause);

    /**
     * 更新文章信息
     *
     * @param mtArticle
     * @return
     */
    Integer updateArticleById(MtArticle mtArticle);

    /**
     * 添加文章
     *
     * @param mtArticle
     * @return
     */
    Integer saveArticle(MtArticle mtArticle);

    /**
     * 删除文章
     *
     * @param articleId
     * @return
     */
    Integer deleteArticle(Integer articleId);
}
