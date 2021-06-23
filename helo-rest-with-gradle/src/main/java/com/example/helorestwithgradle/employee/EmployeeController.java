package com.example.helorestwithgradle.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;
import java.util.Random;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private RandomNumber randomNumberEmployee;

    @GetMapping("/employee/{id}")

    public EmployeeResponse getEmployeeByIDWithPathVariable(@PathVariable String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);

        } catch (NumberFormatException e) {
            //Can't Convert;
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Invalid ID", e);
        }

        int number = randomNumberEmployee.nextInt(10);

        Optional<Employee> result = repository.findById(_id); // Optional won't return null
        if(result.isPresent()){
            Employee emp = result.get();
            return new EmployeeResponse(emp.getId(), emp.getFirstName() + number, emp.getLastName());
        }
        return new EmployeeResponse();
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByIDWithRequestParam(@RequestParam String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);

        } catch (NumberFormatException e) {
            //Can't Convert;
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Invalid ID", e);
        }

        int number = randomNumberEmployee.nextInt(10);

        Optional<Employee> result = repository.findById(_id); // Optional won't return null
        if(result.isPresent()){
            Employee emp = result.get();
            return new EmployeeResponse(emp.getId(), emp.getFirstName() + number, emp.getLastName());
        }
        return new EmployeeResponse();
    }

    @PostMapping("/employee")
    public EmployeeResponse createEmployee(@RequestBody EmployeeRequest request) {
        Employee emp = new Employee(request.getFname(),request.getLname());
        Employee savedEmp = repository.save(emp);
        int number = randomNumberEmployee.nextInt(10);
        return new EmployeeResponse(savedEmp.getId(),savedEmp.getFirstName()+number,savedEmp.getLastName());

    }
}
