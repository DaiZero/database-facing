package com.dzero.databasefacing.service.imple;

import com.dzero.databasefacing.entity.User;
import com.dzero.databasefacing.repository.UserRepository;
import com.dzero.databasefacing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void add(User user) {
        User newUser=new User();
        userRepo.insert(user);
    }
}
