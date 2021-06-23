package com.example.helorestwithgradle.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private RandomNumber randomNumber;

    @Mock
    private EmployeeRepository repository;

    @BeforeEach
    public void setUp(){
        when(randomNumber.nextInt(10)).thenReturn(5);

    }
    @Test
    public void foundEmployeeID1NotFound(){
        when(repository.findById(100)).thenReturn(
                Optional.empty()
        );


        EmployeeService service = new EmployeeService();
        service.setRandom(randomNumber);
        service.setRepo(repository);
        Exception exception = assertThrows(EmployeeNotFoundException.class, () -> service.findByID(100));
        assertEquals("Employee ID 100 not found",exception.getMessage());


    }

    @Test
    public void foundEmployeeID1Found(){
        Employee mock = new Employee(1,"Service FName","Service LName");
        when(repository.findById(1)).thenReturn(
                Optional.of(mock)
        );

        EmployeeService service = new EmployeeService();
        service.setRandom(randomNumber);
        service.setRepo(repository);
        EmployeeResponse emp = service.findByID(1);
        assertEquals(1,emp.getId());
        assertEquals("Service FName5",emp.getFname());
        assertEquals("Service LName",emp.getLname());

    }

}