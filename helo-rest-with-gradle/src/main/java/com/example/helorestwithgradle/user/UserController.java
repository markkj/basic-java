package com.example.helorestwithgradle.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Users getAllUserWithIDMod2Equal0(){
        return userService.getAllUserWithIDMod2Equal0();
    }
}
