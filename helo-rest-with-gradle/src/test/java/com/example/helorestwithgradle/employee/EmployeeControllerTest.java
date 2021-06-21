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
        EmployeeResponse expectedResponse = new EmployeeResponse(123,"Khajohnyos5","Mark");
        EmployeeResponse res =  restTemplate.getForObject("/employee/123",EmployeeResponse.class);
        // assertEquals(expectedResponse.toString(),res.toString()); // shouldn't
        assertEquals(expectedResponse,res);

    }

    @Test
    public void callApiWithRequestParams(){
        EmployeeResponse expectedResponse = new EmployeeResponse(123,"Khajohnyos5","Mark");
        EmployeeResponse res =  restTemplate.getForObject("/employee?id=123",EmployeeResponse.class);
        // assertEquals(expectedResponse.toString(),res.toString()); // shouldn't
        assertEquals(expectedResponse,res);

    }
}