package com.assssert.mybatis.controller;

import com.assssert.mybatis.entity.User;
import com.assssert.mybatis.entity.UserDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserDao userDao;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser(@RequestParam int id) {
        User user = userDao.getAllUser(id);
        return user.toString();
    }
}
