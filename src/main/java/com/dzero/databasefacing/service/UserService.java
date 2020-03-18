package com.dzero.databasefacing.service;

import com.dzero.databasefacing.entity.UserEntity;

/**
 * @author DZero
 */
public interface UserService {

    /**
     * 新增人员信息
     * @param userEntity
     */
    void add(UserEntity userEntity);
}
