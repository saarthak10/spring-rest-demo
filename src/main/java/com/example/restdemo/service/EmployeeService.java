package com.example.restdemo.service;

import com.example.restdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int id);

    Employee save(Employee employee);

    void delete(int id);

}
