package com.at.ssm.service.impl;
import com.at.ssm.mapper.UserMapper;
import com.at.ssm.poro.User;
import com.at.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getUserList() {
        return userMapper.getList();
    }
}
