package com.example.hellospring.workshop01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateUUIDTest {

    @Test
    public void shouldGetUUID(){
        GenerateUUID uuid = new GenerateUUID();
        uuid.setRandomNumber(new Random4());
        String result = uuid.getID("Khajohnyos");
        assertEquals("XYZKhajohnyos4",result);
    }
}