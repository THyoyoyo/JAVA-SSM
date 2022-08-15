package com.at.ssm.controller;

import com.at.ssm.poro.User;

import com.at.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    @ResponseBody
    public List<User> getUserList(){
        List<User> list = userService.getUserList();
       return  list;
    }
}
