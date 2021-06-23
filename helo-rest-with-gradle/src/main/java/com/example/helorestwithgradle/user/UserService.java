package com.example.helorestwithgradle.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserGateway userGateway;

    public Users getAllUserWithIDMod2Equal0(){
        Users users = userGateway.getAllUsers();
        List<UserModel> temp = new ArrayList<>();
        for (UserModel user:
             users.getUsers()) {
            if(user.getId() %2 == 0){
                temp.add(user);
            }
        }
        users.setUsers(temp);
        return users;
    }

}
