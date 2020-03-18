package com.dzero.databasefacing.controller;

import com.dzero.databasefacing.entity.UserEntity;
import com.dzero.databasefacing.service.UserService;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DZero
 */
@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public void add(@RequestBody UserEntity userEntity){
        if(userEntity.getId()==null){
            Assert.notNull(userEntity.getId(),"dddd");
//            throw new Exception("2222");
        }
        userService.add(userEntity);
    }
}
