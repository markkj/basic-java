package com.example.helorestwithgradle.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void callApiWithPathVariable(){
        EmployeeResponse res =  restTemplate.getForObject("/employee/123",EmployeeResponse.class);
        assertEquals(123,res.getId());
        assertEquals("Khajohnyos",res.getFname());
        assertEquals("Mark",res.getLname());

    }

    @Test
    public void callApiWithRequestParams(){
        EmployeeResponse res =  restTemplate.getForObject("/employee?id=123",EmployeeResponse.class);
        assertEquals(123,res.getId());
        assertEquals("Khajohnyos",res.getFname());
        assertEquals("Mark",res.getLname());

    }
}