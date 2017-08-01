package com.mutoublog.service;


import com.mutoublog.dao.entity.MtUser;

import java.util.List;
import java.util.Map;

/**
 * Created by mutou on 2017/2/15.
 */
public interface UserService {
    /**
     * 根据用户id获取用户信息
     */
    MtUser getUserById(Integer userId);

    /**
     * 根据用户名获取用户信息
     * @param user 用户名
     * @return MtUser
     */
    MtUser getUserByName(String user);

    /**
     * 根据状态获取所有用户
     */
    List<MtUser> getUsersByClause(Map clause);

    /**
     * 更新用户信息
     */
    Integer updateUserById(MtUser mtUser);

    /**
     * 添加用户
     */
    Integer saveUser(MtUser mtUser);

    /**
     * 删除用户
     */
    Integer deleteUser(Integer userId);
}
