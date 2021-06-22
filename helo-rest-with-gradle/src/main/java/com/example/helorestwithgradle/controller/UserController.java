package com.example.helorestwithgradle.controller;
import com.example.helorestwithgradle.service.UserService;
import com.example.helorestwithgradle.user.User;
import com.example.helorestwithgradle.user.UserList;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class UserController {



    @GetMapping("/users")
    public UserList getUserList(){
        UserList users = new UserList();
        UserService service = new UserService();
        service.mockupUsers(users);
        return users;
    }
}
