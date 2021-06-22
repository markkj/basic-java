package com.example.helorestwithgradle.user;


import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
;
import java.util.List;
import java.util.Objects;


public class UserList extends Object {

    private List<User> users;


    public UserList() {
        users = new ArrayList<>();
        String[] jsonStringData = new String[]{
                "{\n" +
                        "    \"id\": 1,\n" +
                        "    \"name\": \"Leanne Graham\",\n" +
                        "    \"username\": \"Bret\",\n" +
                        "    \"email\": \"Sincere@april.biz\",\n" +
                        "    \"address\": {\n" +
                        "      \"street\": \"Kulas Light\",\n" +
                        "      \"suite\": \"Apt. 556\",\n" +
                        "      \"city\": \"Gwenborough\",\n" +
                        "      \"zipcode\": \"92998-3874\",\n" +
                        "      \"geo\": {\n" +
                        "        \"lat\": \"-37.3159\",\n" +
                        "        \"lng\": \"81.1496\"\n" +
                        "      }\n" +
                        "    },\n" +
                        "    \"phone\": \"1-770-736-8031 x56442\",\n" +
                        "    \"website\": \"hildegard.org\",\n" +
                        "    \"company\": {\n" +
                        "      \"name\": \"Romaguera-Crona\",\n" +
                        "      \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
                        "      \"bs\": \"harness real-time e-markets\"\n" +
                        "    }\n" +
                        "  }",
                "{\n" +
                        "    \"id\": 2,\n" +
                        "    \"name\": \"Ervin Howell\",\n" +
                        "    \"username\": \"Antonette\",\n" +
                        "    \"email\": \"Shanna@melissa.tv\",\n" +
                        "    \"address\": {\n" +
                        "      \"street\": \"Victor Plains\",\n" +
                        "      \"suite\": \"Suite 879\",\n" +
                        "      \"city\": \"Wisokyburgh\",\n" +
                        "      \"zipcode\": \"90566-7771\",\n" +
                        "      \"geo\": {\n" +
                        "        \"lat\": \"-43.9509\",\n" +
                        "        \"lng\": \"-34.4618\"\n" +
                        "      }\n" +
                        "    },\n" +
                        "    \"phone\": \"010-692-6593 x09125\",\n" +
                        "    \"website\": \"anastasia.net\",\n" +
                        "    \"company\": {\n" +
                        "      \"name\": \"Deckow-Crist\",\n" +
                        "      \"catchPhrase\": \"Proactive didactic contingency\",\n" +
                        "      \"bs\": \"synergize scalable supply-chains\"\n" +
                        "    }\n" +
                        "  }"
        };


        Gson g = new Gson();
        for (String data :
                jsonStringData) {

            User user = g.fromJson(data, User.class);
            users.add(user);
        }
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
}
