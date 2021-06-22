package com.example.helorestwithgradle.user;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
;
import java.util.List;
import java.util.Objects;


public class UserList {

    private List<User> users;

    public void addUser(User user) {
        users.add(user);
    }

    public UserList(){
        users = new ArrayList<>();

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
    @Bean
    public List<User> getUsers() {
        return users;
    }
}
