package com.example.helorestwithgradle;

import com.example.helorestwithgradle.user.User;
import com.example.helorestwithgradle.user.UserList;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HeloRestWithGradleApplication implements CommandLineRunner {



    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(HeloRestWithGradleApplication.class, args);

        String[] objects = ctx.getBeanDefinitionNames();
        for (String object :
                objects) {
            System.out.println(object);
        }

        int count = ctx.getBeanDefinitionCount();
        System.out.println("Total =  " + count);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Start ....");
        System.out.println("Stop ....");
    }


}
