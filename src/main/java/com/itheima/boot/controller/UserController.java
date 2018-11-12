package com.itheima.boot.controller;

import com.itheima.boot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.annotation.Resource;

/**
 * @author NQ
 * @create 2018-11-09 16:47
 */
@RestController
public class UserController {

//    @Autowired
    @Resource(name = "user")
    User user;

    @Autowired
    CharacterEncodingFilter characterEncodingFilter;

    @GetMapping("getUser")
    public User getUser(String name) {

        System.out.println(name);
        String encoding = characterEncodingFilter.getEncoding();
        System.out.println("编码： " + encoding);
        return user;
    }
}
