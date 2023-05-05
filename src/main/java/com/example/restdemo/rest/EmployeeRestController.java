package com.example.restdemo.rest;

import com.example.restdemo.entity.Employee;
import com.example.restdemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService theEmployeeService) {
        this.employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getSingleEmployee(@PathVariable int employeeId){

       Employee theEmployee =  employeeService.findById(employeeId);
       if (theEmployee == null){
           throw new RuntimeException("Employee Not Found->" + employeeId);
       }
       return theEmployee;
    }



}
