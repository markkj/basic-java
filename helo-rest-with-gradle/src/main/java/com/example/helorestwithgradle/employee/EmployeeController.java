package com.example.helorestwithgradle.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class EmployeeController {

    @Autowired
    private RandomNumberEmployee randomNumberEmployee;

    public void setRandomNumber(RandomNumberEmployee randomNumber) {
        this.randomNumberEmployee = randomNumber;
    }
    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable String id){
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e){
            //Can't Convert;
            _id = 0;
        }

        int number = this.randomNumberEmployee.nextInt(10);
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

        return new EmployeeResponse(_id,"Khajohnyos","Mark");
    }
}
