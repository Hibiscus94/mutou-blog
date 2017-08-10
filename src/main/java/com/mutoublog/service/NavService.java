package com.mutoublog.service;

import com.mutoublog.dao.entity.MtNav;
import java.util.List;

/**
 * com.mutoublog.service
 * Created by mutou on 2017/8/3.
 */
public interface NavService {
    /**
     * 根据id查询导航
     */
    MtNav getNavInfo(MtNav mtNav);

    /**
     * 查询所有导航信息
     */
    List<MtNav> getAllNavInfo(MtNav MtNav);

    /**
     * 更新导航
     */
    Integer updateNav(MtNav MtNav);

    /**
     * 保存导航
     */
    Integer saveNav(MtNav MtNav);

    /**
     * 根据id删除导航
     */
    Integer deleteNavById(Byte id);
}