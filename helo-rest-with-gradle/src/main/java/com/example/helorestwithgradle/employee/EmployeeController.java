package com.example.helorestwithgradle.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(int id){
        return new EmployeeResponse(id,"Khajohnyos","Mark");
    }
}
