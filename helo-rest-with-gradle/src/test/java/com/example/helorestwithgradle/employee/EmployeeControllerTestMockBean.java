package com.example.helorestwithgradle.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class EmployeeControllerTestMockBean {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private RandomNumber randomNumberEmployee;

    @MockBean
    private EmployeeRepository repository;

    @Test
    public void callApiWithPathVariableWithoutDatabase(){
        when(randomNumberEmployee.nextInt(10)).thenReturn(5);
        Employee mock = new Employee(123,"Khajohnyos","Mark");
        when(repository.findById(123)).thenReturn(
                Optional.of(mock)
        );



        EmployeeResponse expectedResponse = new EmployeeResponse(123,"Khajohnyos5","Mark");

        EmployeeResponse res =  restTemplate.getForObject("/employee/123",EmployeeResponse.class);

        // assertEquals(expectedResponse.toString(),res.toString()); // shouldn't

        assertEquals(expectedResponse,res);

    }

    @Test
    public void callApiWithPathVariableWithoutDatabase2(){
        when(randomNumberEmployee.nextInt(10)).thenReturn(5);

        Employee mock = new Employee(123,"Khajohnyos","Mark");
        when(repository.findById(123)).thenReturn(
                Optional.empty()
        );

        EmployeeResponse expectedResponse = new EmployeeResponse();

        EmployeeResponse res =  restTemplate.getForObject("/employee/123",EmployeeResponse.class);

        // assertEquals(expectedResponse.toString(),res.toString()); // shouldn't

        assertEquals(expectedResponse,res);

    }



}