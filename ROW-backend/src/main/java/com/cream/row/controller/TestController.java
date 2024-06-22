package com.cream.row.controller;

import com.cream.row.entity.User;
import com.cream.row.mapper.UserMapper;
import com.cream.row.utils.Times;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final UserMapper userMapper;

    public TestController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/test")
    public void test() {
        User user = new User();
        user.setUsername("test" + Times.now());
        user.setPassword("test123456");
        userMapper.insert(user);
    }
}
