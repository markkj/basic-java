package com.example.hellospring.workshop01;

public class SayBuzz implements Say {

    public boolean isTrue;

    @Override
    public String getResult() {
        return "Buzz";
    }

    @Override
    public boolean check(String input) {
        return Integer.valueOf(input) % 5 == 0;
    }


}
