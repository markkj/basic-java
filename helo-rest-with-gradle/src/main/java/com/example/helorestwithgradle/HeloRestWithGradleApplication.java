package com.example.helorestwithgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HeloRestWithGradleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(HeloRestWithGradleApplication.class, args);

        String[] objects = ctx.getBeanDefinitionNames();
		for (String object:
			 objects) {
			System.out.println(object);
		}

        int count = ctx.getBeanDefinitionCount();
        System.out.println("Total =  " + count);
    }

}
