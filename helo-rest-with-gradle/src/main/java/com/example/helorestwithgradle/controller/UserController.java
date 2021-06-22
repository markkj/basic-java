package com.example.helorestwithgradle.controller;
import com.example.helorestwithgradle.service.UserService;
import com.example.helorestwithgradle.user.User;
import com.example.helorestwithgradle.user.UserList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class UserController {



    @GetMapping("/users")
    public List<User> getUserList(){
        UserService service = new UserService();
        UserList users = new UserList();
        service.addUserToList(users);

        return users.getUsers();
    }
}
