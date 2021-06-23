package com.example.helorestwithgradle.employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private RandomNumber randomNumber;

    @Mock
    private EmployeeRepository repository;

    @Test
    public void foundEmployeeID1NotFound(){
        when(repository.findById(100)).thenReturn(
                Optional.empty()
        );

        EmployeeService service = new EmployeeService();
        service.setRepo(repository);

        EmployeeResponse result = service.findByID(100);
        assertEquals(0, result.getId());
        assertNull(result.getFname());
        assertNull(result.getLname());

    }

    @Test
    public void foundEmployeeID1Found(){
        when(randomNumber.nextInt(10)).thenReturn(5);
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