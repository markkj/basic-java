package com.example.hellospring;

public class DemoExtend {
    public static void main(String[] args) {
        Report1 rp = new Report1();
        rp.build();
    }
}


abstract class Report {
    abstract void generateHeader();
    abstract void generateBody();
    abstract void generateFooter();

    public void build(){
        generateHeader();
        generateBody();
        generateFooter();
    }
}

class Report1 extends Report{

    @Override
    void generateHeader() {
        System.out.println("Header");
    }

    @Override
    void generateBody() {
        System.out.println("Body");
    }

    @Override
    void generateFooter() {
        System.out.println("Footer");
    }
}