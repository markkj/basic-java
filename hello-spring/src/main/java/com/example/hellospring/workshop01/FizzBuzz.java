package com.example.hellospring.workshop01;

public class FizzBuzz {
    String input;
    public FizzBuzz(String s) {
        this.input = s;
    }

    public String getResult() {
        if (Integer.valueOf(this.input)%3==0 && Integer.valueOf(this.input)%5==0){
            return "FizzBuzz";
        }else if(Integer.valueOf(this.input)%3==0){
            return "Fizz";
        }else if(Integer.valueOf(this.input)%5==0){
            return "Buzz";
        }
        return this.input;
    }
}
