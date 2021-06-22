package com.example.helorestwithgradle.controller;
import com.example.helorestwithgradle.service.UserService;
import com.example.helorestwithgradle.user.User;
import com.example.helorestwithgradle.user.UserList;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private UserList users = new UserList();

    @GetMapping("/users")
    public List<User> getUserList(){
        return users.getUsers();
    }


}
