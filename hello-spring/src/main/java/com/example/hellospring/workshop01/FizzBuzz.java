package com.example.hellospring.workshop01;

public class FizzBuzz{
    String input;

    public FizzBuzz(String s) {
        this.input = s;
    }

    public String getResult() {
        Say[] says = new Say[]{
                new SayFizzBuzz(),
                new SayBuzz(),
                new SayFizz(),
                new SayKBTG(),
        };
        for(Say say:says){
            if(say.check(this.input)){
                return say.getResult();
            }
        }


        return this.input;
    }
}


