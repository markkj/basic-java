package com.example.helorestwithgradle.controller;

import com.example.helorestwithgradle.user.Address;
import com.example.helorestwithgradle.user.User;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers(@RequestParam int limits){
        List<User> users = new ArrayList<>();


        return users;
    }
}
