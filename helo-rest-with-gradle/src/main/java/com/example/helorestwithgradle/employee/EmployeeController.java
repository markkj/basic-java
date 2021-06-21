package com.example.helorestwithgradle.employee;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")
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

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByID2(@RequestParam String id){
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
