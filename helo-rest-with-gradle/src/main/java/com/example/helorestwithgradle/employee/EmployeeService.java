package com.example.helorestwithgradle.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private RandomNumber randomNumberEmployee;

    @Autowired
    private EmployeeRepository repository;

    public EmployeeResponse findByID(int id){
        int number = randomNumberEmployee.nextInt(10);

        Optional<Employee> result = repository.findById(id); // Optional won't return null
        if(result.isPresent()){
            Employee emp = result.get();
            return new EmployeeResponse(emp.getId(), emp.getFirstName() + number, emp.getLastName());
        }
        return new EmployeeResponse();
    }
}
