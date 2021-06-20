package com.example.hellospring.refactor;

public class Player {
    private String name;
    private int point;

    public Player(String name) {
        this.name = name;
    }

    public int getPoint(){
        return point;
    }

    public String getName(){
        return name;
    }

    public void addPoint(){
        point += 1;
    }
}
