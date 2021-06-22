package com.example.helorestwithgradle.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.boot.test.context.SpringBootTest.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private RandomNumber randomNumberEmployee;

    @Test
    public void callApiWithPathVariable(){
        when(randomNumberEmployee.nextInt(10)).thenReturn(5);
        EmployeeResponse expectedResponse = new EmployeeResponse(123,"Khajohnyos5","Mark");
        EmployeeResponse res =  restTemplate.getForObject("/employee/123",EmployeeResponse.class);
        // assertEquals(expectedResponse.toString(),res.toString()); // shouldn't
        assertEquals(expectedResponse,res);

    }

    @Test
    public void callApiWithRequestParams(){
        when(randomNumberEmployee.nextInt(10)).thenReturn(5);
        EmployeeResponse expectedResponse = new EmployeeResponse(123,"Khajohnyos5","Mark");
        EmployeeResponse res =  restTemplate.getForObject("/employee?id=123",EmployeeResponse.class);
        // assertEquals(expectedResponse.toString(),res.toString()); // shouldn't
        assertEquals(expectedResponse,res);

    }

    @Test
    public void callApiWithPostRequest(){
        when(randomNumberEmployee.nextInt(10)).thenReturn(5);
        EmployeeResponse expectedResponse = new EmployeeResponse(999,"Khajohnyos5","Mark");

        EmployeeRequest employeeRequest = new EmployeeRequest();
        employeeRequest.setFname("Khajohnyos");
        employeeRequest.setLname("Mark");

        EmployeeResponse res =  restTemplate.postForObject("/employee",employeeRequest,EmployeeResponse.class);
        // assertEquals(expectedResponse.toString(),res.toString()); // shouldn't
        assertEquals(expectedResponse,res);

    }

}