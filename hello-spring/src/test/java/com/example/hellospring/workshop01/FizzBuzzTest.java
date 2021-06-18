package com.example.hellospring.workshop01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName(" 1 -> 1")
    public void testcase01(){
        FizzBuzz fz = new FizzBuzz("1");
        String result = fz.getResult();
        assertEquals("1",result);
    }

    @Test
    @DisplayName(" 2 -> 2")
    public void testcase02(){
        FizzBuzz fz = new FizzBuzz("2");
        String result = fz.getResult();
        assertEquals("2",result);
    }

    @Test
    @DisplayName(" 3 -> Fizz")
    public void testcase03(){
        FizzBuzz fz = new FizzBuzz("3");
        String result = fz.getResult();
        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName(" 4 -> 4")
    public void testcase04(){
        FizzBuzz fz = new FizzBuzz("4");
        String result = fz.getResult();
        assertEquals("4",result);
    }

    @Test
    @DisplayName(" 5 -> Buzz")
    public void testcase05(){
        FizzBuzz fz = new FizzBuzz("5");
        String result = fz.getResult();
        assertEquals("Buzz",result);
    }

    @Test
    @DisplayName(" 6 -> Fizz")
    public void testcase06(){
        FizzBuzz fz = new FizzBuzz("6");
        String result = fz.getResult();
        assertEquals("Fizz",result);
    }
}