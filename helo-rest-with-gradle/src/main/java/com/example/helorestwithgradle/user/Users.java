package com.example.helorestwithgradle.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Users {
    private List<UserModel> users;

    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }




}
