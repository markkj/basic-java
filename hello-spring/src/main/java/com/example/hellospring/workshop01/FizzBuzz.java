package com.example.hellospring.workshop01;

public class FizzBuzz {
    String input;
    public FizzBuzz(String s) {
        this.input = s;
    }

    public String getResult() {
        if("3".equals(this.input)){
            return "Fizz";
        }
        return this.input;
    }
}
