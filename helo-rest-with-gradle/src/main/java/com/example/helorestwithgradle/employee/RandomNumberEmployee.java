package com.example.helorestwithgradle.employee;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomNumberEmployee extends Random {

}

class RandNumber5 extends RandomNumberEmployee{
    @Override
    public int nextInt(int bound){
        return 5;
    }
}
