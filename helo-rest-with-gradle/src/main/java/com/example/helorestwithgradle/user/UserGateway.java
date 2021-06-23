package com.example.helorestwithgradle.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class UserGateway {

    @Autowired
    RestTemplate restTemplate;

    public Users getAllUsers(){
        UserModel[] result = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users",UserModel[].class);
        Users users = new Users();
        users.setUsers(Arrays.asList(result));

        return users;
    }

    public UserModel getUserByID(int id){
        UserModel result = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/"+id,UserModel.class);
        return result;
    }


}
