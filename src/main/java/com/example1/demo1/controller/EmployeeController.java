package com.example1.demo1.controller;

import com.example1.demo1.model.Employee;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @GetMapping("/employee")
    public String getEmployee(){
        return "mazdoor khan";
    }

    @PostMapping("/greet")
    public String greetEmployee(@RequestParam String name){
        return "Hello "+name;
    }

    @PostMapping("/employee")
    public String createEmployee(@Validated @RequestBody Employee employee){
        /* Example condition to throw 404
        if (employee.getId() == null) {
            throw new ResourceNotFoundException("Employee ID not found");
        }

        // Example condition to throw 300
        if (employee.getName() == null) {
            throw new MultipleChoicesException("Multiple choices available for employee names");
        }

        // Example condition to throw 500
        if (employee.getDepartment() == null) {
            throw new InternalServerException("Internal server error while processing the department");
        }
    */
        return employee.toString();
    }
}
