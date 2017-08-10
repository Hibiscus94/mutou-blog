package com.mutoublog.service;

import com.mutoublog.dao.entity.MtBackground;

import java.util.List;

/**
 * com.mutoublog.service
 * Created by mutou on 2017/8/3.
 */
public interface BackgroundService {
    /**
     * 根据条件动态查询单条背景图片信息
     */
    MtBackground getBackgroundByClause(String items, MtBackground mtBackground);

    /**
     * 根据条件查询背景图片信息
     */
    List<MtBackground> getBackgroundsByClause(MtBackground mtBackground);

    /**
     * 根据条件更新背景图片信息
     */
    Integer updateBackground(MtBackground mtBackground);

    /**
     * 保存背景图片信息
     */
    Integer saveBackground(MtBackground mtBackground);

    /**
     * 根据背景图片id删除背景图片
     */
    Integer deleteBackgroundById(Integer id);
}