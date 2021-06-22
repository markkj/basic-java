package com.example.helorestwithgradle.user;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class UserList {

    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
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
}
