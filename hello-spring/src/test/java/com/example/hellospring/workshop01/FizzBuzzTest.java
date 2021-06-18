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
}