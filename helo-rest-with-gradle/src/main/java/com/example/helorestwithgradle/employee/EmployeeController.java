package com.example.helorestwithgradle.employee;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")
    @ExceptionHandler()
    public EmployeeResponse getEmployeeByID(@PathVariable String id){
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e){
            //Can't Convert;
            _id = 0;
        }

        return new EmployeeResponse(_id,"Khajohnyos","Mark");
    }
}
