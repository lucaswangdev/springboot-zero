package com.lucaswangdev.service.impl;

import com.lucaswangdev.entiry.User;
import com.lucaswangdev.mapper.UserMapper;
import com.lucaswangdev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
