package com.demo;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class ExceptionDemo {
    private Logger logger = Logger.getLogger(ExceptionDemo.class);
    private Map<Integer,String> users = new HashMap<>();

    public String method1(String s){

        return method2(s);
    }

    public String method2(String s){
        s += "2";
        try{
            return method3(s);
        }catch (InvalidInputException e){
            logger.error(e);
            return e.getMessage();
        }
    }

    public String method3(String s) {
        int _id = 0;
        try{
            _id = Integer.parseInt(s);
        }catch (NumberFormatException e){
            throw new InvalidInputException("Invalid Input " + e.getMessage());
        }
        return findUserById(_id);

    }

    private String findUserById(int id) {
        String name = users.get(id);
        return name;
    }
}
