package com.example.restdemo.service;

import com.example.restdemo.dao.EmployeeDao;
import com.example.restdemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao theEmployeeDao){
        this.employeeDao = theEmployeeDao;
    }


    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
