package com.example.helorestwithgradle.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class EmployeeController {

    @Bean
    public Random CreateNewRandom(){
        return new Random();
    }

    @Autowired
    private Random randomNumberEmployee;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id){
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e){
            //Can't Convert;
            _id = 0;
        }

        int number = randomNumberEmployee.nextInt(10);
        return new EmployeeResponse(_id,"Khajohnyos"+number,"Mark");
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
        int number = randomNumberEmployee.nextInt(10);
        return new EmployeeResponse(_id,"Khajohnyos"+number,"Mark");
    }

    @PostMapping("/employee")
    public EmployeeResponse createEmployee(@RequestBody EmployeeRequest request){
        return new EmployeeResponse(999,"Khajohnyos","Mark");

    }
}
