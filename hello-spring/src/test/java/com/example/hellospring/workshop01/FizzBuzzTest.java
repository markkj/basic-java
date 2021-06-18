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

    @Test
    @DisplayName(" 7 -> 7")
    public void testcase07(){
        FizzBuzz fz = new FizzBuzz("7");
        String result = fz.getResult();
        assertEquals("7",result);
    }

    @Test
    @DisplayName(" 8 -> 8")
    public void testcase08(){
        FizzBuzz fz = new FizzBuzz("8");
        String result = fz.getResult();
        assertEquals("8",result);
    }

    @Test
    @DisplayName(" 9 -> Fizz")
    public void testcase09(){
        FizzBuzz fz = new FizzBuzz("9");
        String result = fz.getResult();
        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName(" 10 -> Buzz")
    public void testcase10(){
        FizzBuzz fz = new FizzBuzz("10");
        String result = fz.getResult();
        assertEquals("Buzz",result);
    }

    @Test
    @DisplayName(" 11 -> 11")
    public void testcase11(){
        FizzBuzz fz = new FizzBuzz("11");
        String result = fz.getResult();
        assertEquals("11",result);
    }

    @Test
    @DisplayName(" 12 -> Fizz")
    public void testcase12(){
        FizzBuzz fz = new FizzBuzz("12");
        String result = fz.getResult();
        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName(" 15 -> FizzBuzz")
    public void testcase13(){
        FizzBuzz fz = new FizzBuzz("15");
        String result = fz.getResult();
        assertEquals("FizzBuzz",result);
    }
}