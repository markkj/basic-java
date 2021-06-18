package com.example.hellospring.workshop01;

public class FizzBuzz {
    String input;
    public FizzBuzz(String s) {
        this.input = s;
    }

    public String getResult() {
        if("3".equals(this.input)){
            return "Fizz";
        }else if("5".equals(this.input)){
            return "Buzz";
        }
        return this.input;
    }
}
