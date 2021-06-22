package com.example.helorestwithgradle.controller;

import com.example.helorestwithgradle.user.MockUser;
import com.example.helorestwithgradle.user.User;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetAllUsers(){
        MockUser ExpectUsers = new MockUser();
        ResponseEntity<User[]> expectUsersList = ExpectUsers.getUsersList();
        ResponseEntity<User[]> userList = restTemplate.getForObject("/users",ResponseEntity.class);
        assertEquals(expectUsersList,userList);
    }
}