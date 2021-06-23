package com.example.helorestwithgradle.user;

import com.example.helorestwithgradle.user.UserGateway;
import com.example.helorestwithgradle.user.UserModel;
import com.example.helorestwithgradle.user.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserGatewayTest {

    @Autowired
    private UserGateway userGateway;

    @Test
    public void testCallUserGateway(){
        Users users = userGateway.getAllUsers();
        assertEquals(10,users.getUsers().size());
    }

    @Test
    public void testCallUserGatewayByID(){
        UserModel user = userGateway.getUserByID(1);
        assertEquals(1,user.getId());
    }

}