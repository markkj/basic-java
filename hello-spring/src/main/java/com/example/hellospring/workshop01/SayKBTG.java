package com.example.hellospring.workshop01;

public class SayKBTG implements Say{

    public boolean isTrue;



    @Override
    public String getResult() {
        return "KBTG JAVA WORKSHOP";
    }

    @Override
    public boolean check(String input) {
        return Integer.valueOf(input)== 7;
    }

}
