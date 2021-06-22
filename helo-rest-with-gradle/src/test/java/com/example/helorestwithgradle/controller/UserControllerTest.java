package com.example.helorestwithgradle.controller;

import com.example.helorestwithgradle.service.UserService;
import com.example.helorestwithgradle.user.User;
import com.example.helorestwithgradle.user.UserList;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserService service;

    @Test
    public void testGetAllUsers(){
        //Setup

        UserList expectUsersList = new UserList();
        service.mockupUsers(expectUsersList);

        //Action
        List<User> expectResponse = expectUsersList.getUsers();
        ResponseEntity<User[]> responseEntity =
                restTemplate.getForEntity("/users", User[].class);
        User[] userArray = responseEntity.getBody();
        List<User> response = Arrays.asList(userArray);
        //Check

        assertEquals(expectResponse,response);

    }
}