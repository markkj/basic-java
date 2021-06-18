package com.example.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID{

    public int randomNumber;


    public void setRandomNumber(int random) {
        this.randomNumber = random;
    }


    public String getID(String name) {
        String id = "XYZ" + name + randomNumber;
        return id;
    }
}

