package com.example.helorestwithgradle.controller;
import com.example.helorestwithgradle.service.UserService;
import com.example.helorestwithgradle.user.User;
import com.example.helorestwithgradle.user.UserList;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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

    @GetMapping("/user/{id}")
    public User getUserByID(@PathVariable int id){
        try{
            return users.getUserID(id);
        }catch (IndexOutOfBoundsException e){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Foo Not Found", e);
        }

    }

}
