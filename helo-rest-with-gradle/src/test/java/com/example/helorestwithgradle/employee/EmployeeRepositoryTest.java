package com.example.helorestwithgradle.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DataJpaTest
class EmployeeRepositoryTest {

    @MockBean
    private EmployeeRepository repository;


    @Test
    public void foundWithID1(){
        Employee expectEmp = new Employee("Mark from DB","Bk from DB");
        expectEmp.setId(1);
        when(repository.getById(1)).thenReturn(expectEmp);

        Employee employee1 = repository.getById(1);
        assertEquals(1, employee1.getId());
        assertEquals("Mark from DB",employee1.getFirstName());
        assertEquals("Bk from DB",employee1.getLastName());
    }

}