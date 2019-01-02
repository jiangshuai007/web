package com.ynu.sei.lib.controller;


import com.ynu.sei.lib.domain.User;
import com.ynu.sei.lib.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<User> userList() {
        return userRepository.findAll();
    }

    // @RequestBody注解可以接收json格式的数据，并将其转换成对应的数据类型
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        userRepository.save(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.POST)
    public User findUserByName(@RequestParam("name") String name) {
        return userRepository.getByName(name);
    }
}
