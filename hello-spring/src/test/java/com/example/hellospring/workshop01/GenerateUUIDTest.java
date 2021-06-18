package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateUUIDTest {

    @Test
    public void shouldGetUUID(){
        GenerateUUID uuid = new GenerateUUID();
        int rndNumber = uuid.randomNumber();
        String result = uuid.getID(rndNumber,"Khajohnyos");
        assertEquals("XYZKhajohnyos"+rndNumber,result);
    }
}