package com.example.hellospring.workshop01;

import java.util.Random;

public class GenerateUUID  extends Generate{

    @Override
    int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        return randomNumber;
    }
}

abstract class Generate{
    abstract int randomNumber();


    public String getID(int rndNumber,String name){
        String id = "XYZ" + name + rndNumber;
        return id;
    }
}