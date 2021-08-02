package com.demo;

import org.apache.log4j.Logger;

public class ExceptionDemo {
    private Logger logger = Logger.getLogger(ExceptionDemo.class);

    public int method1(String s){

        return method2(s);
    }

    public int method2(String s){
        s += "2";
        return method3(s);
    }

    private int method3(String s) {
        try{
            int id = Integer.parseInt(s);
            return id;
        }catch (Exception e){
            logger.error(e);
            return -1;
        }
    }
}
