package com.dzero.databasefacing.service.imple;

import com.dzero.databasefacing.entity.UserEntity;
import com.dzero.databasefacing.repository.UserRepository;
import com.dzero.databasefacing.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户表的实现
 * @author DZero
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void add(UserEntity userEntity) {
        userRepo.insert(userEntity);
    }
}
