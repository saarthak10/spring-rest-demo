/*
package com.example.restdemo.rest;

import com.example.restdemo.entity.Employee;
import com.example.restdemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee theEmployee  ){
        //set id to zero in case an Id is passed while submitting a new record.
        theEmployee.setId(0);
        return employeeService.save(theEmployee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){

        return employeeService.save(theEmployee);
    }
    @DeleteMapping("/employees/{employeeId}")
    public String updateEmployee(@PathVariable int employeeId){
        Employee tempEmployee = employeeService.findById(employeeId);
        if (tempEmployee == null){
            throw new RuntimeException("Employee Id Not Found ---" + employeeId);
        }
         employeeService.delete(employeeId);
        return "Employee Deleted Successfully";
    }


}
*/
