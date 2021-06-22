package com.example.helorestwithgradle.user;


import com.example.helorestwithgradle.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
;
import java.util.List;
import java.util.Objects;

@Component
public class UserList {

    private List<User> users;

    @Autowired
    private UserService userService = new UserService();

    public UserList() {
        users = new ArrayList<>();

        userService.mockupUsers(users);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserList userList = (UserList) o;
        return Objects.equals(users, userList.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUsers(User user){
        this.users.add(user);
    }

    public User getUserID(int id) {
        return users.get(id-1);
    }
}
