package com.example.helorestwithgradle.controller;

import com.example.helorestwithgradle.service.UserService;
import com.example.helorestwithgradle.user.User;
import com.example.helorestwithgradle.user.UserList;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetAllUsers(){
        //Setup
        UserList expectUsersList = new UserList();
        UserService service = new UserService();

        //Action
        service.mockupUsers(expectUsersList);
        UserList userList = restTemplate.getForObject("/users",UserList.class);
        //Check

        assertEquals(expectUsersList,userList);

    }
}