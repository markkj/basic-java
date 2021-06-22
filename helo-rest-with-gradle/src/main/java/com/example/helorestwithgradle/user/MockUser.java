package com.example.helorestwithgradle.user;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MockUser {
    private String[] jsonString = new String[]{
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
                    "  }",
            "{\n" +
                    "    \"id\": 3,\n" +
                    "    \"name\": \"Clementine Bauch\",\n" +
                    "    \"username\": \"Samantha\",\n" +
                    "    \"email\": \"Nathan@yesenia.net\",\n" +
                    "    \"address\": {\n" +
                    "      \"street\": \"Douglas Extension\",\n" +
                    "      \"suite\": \"Suite 847\",\n" +
                    "      \"city\": \"McKenziehaven\",\n" +
                    "      \"zipcode\": \"59590-4157\",\n" +
                    "      \"geo\": {\n" +
                    "        \"lat\": \"-68.6102\",\n" +
                    "        \"lng\": \"-47.0653\"\n" +
                    "      }\n" +
                    "    },\n" +
                    "    \"phone\": \"1-463-123-4447\",\n" +
                    "    \"website\": \"ramiro.info\",\n" +
                    "    \"company\": {\n" +
                    "      \"name\": \"Romaguera-Jacobson\",\n" +
                    "      \"catchPhrase\": \"Face to face bifurcated interface\",\n" +
                    "      \"bs\": \"e-enable strategic applications\"\n" +
                    "    }\n" +
                    "  }"
    };
    private List<User> users;

    public void addUserFromJsonString() {
        for (String data:
                jsonString) {
            Gson g = new Gson();
            User s = g.fromJson(data, User.class);
            users.add(s);
        }
    }
}
