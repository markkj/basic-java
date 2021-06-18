package com.example.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID{

    public RandomInterface Random;


    public void setRandomNumber(RandomInterface random) {
        this.Random = random;
    }


    public String getID(String name) {
        String id = "XYZ" + name + Random.nextInt(10);
        return id;
    }
}

interface RandomInterface{
    int nextInt(int bound);
}

class Random4 implements RandomInterface{

    @Override
    public int nextInt(int bound) {
        return 4;
    }
}