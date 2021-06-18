package com.example.hellospring.workshop01;

public class SayFizz implements Say{

    public boolean isTrue;



    @Override
    public String getResult() {
        return "Fizz";
    }

    @Override
    public boolean check(String input) {
        return Integer.valueOf(input) % 3 == 0;
    }

}
