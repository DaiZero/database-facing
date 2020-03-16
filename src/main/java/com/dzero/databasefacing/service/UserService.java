package com.dzero.databasefacing.service;

import com.dzero.databasefacing.entity.User;

/**
 * @author DZero
 */
public interface UserService {

    /**
     * 新增人员信息
     * @param user
     */
    void add(User user);
}
