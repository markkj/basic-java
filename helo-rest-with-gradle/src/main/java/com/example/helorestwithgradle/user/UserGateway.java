package com.example.helorestwithgradle.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserGateway {

    @Autowired
    RestTemplate restTemplate;

    public Users getAllUsers(){
        Users users = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users",Users.class);
        System.out.println(users);
        return users;
    }


}
