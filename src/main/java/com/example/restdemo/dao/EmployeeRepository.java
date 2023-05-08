package com.example.restdemo.dao;

import com.example.restdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.parser.Entity;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
