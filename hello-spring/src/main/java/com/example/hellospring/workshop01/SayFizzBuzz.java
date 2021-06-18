package com.example.hellospring.workshop01;

public class SayFizzBuzz implements Say {

    public boolean isTrue;



    @Override
    public String getResult() {
        return "FizzBuzz";
    }

    @Override
    public boolean check(String input) {
        return (Integer.valueOf(input) % 3 == 0 && Integer.valueOf(input) % 5 == 0);
    }

}
