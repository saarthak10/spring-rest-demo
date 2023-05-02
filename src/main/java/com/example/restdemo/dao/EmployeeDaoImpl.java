package com.example.restdemo.dao;

import com.example.restdemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    //define fields
    private final EntityManager employeeDaoEntityManager;

    //define constructor
    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.employeeDaoEntityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        //create a query
        TypedQuery<Employee> query = employeeDaoEntityManager.createQuery("from Employee", Employee.class);
        // execute query and get result list
        List<Employee> employees = query.getResultList();
        //return results
        return employees;
    }

    @Override
    public Employee findById(int id) {
        //build query for finding an employee
        Employee employee = employeeDaoEntityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        // build query for save or update employee
        Employee emp = employeeDaoEntityManager.merge(employee);
        return emp;
    }

    @Override
    public void delete(int id) {
        //find the employee
        Employee employee = employeeDaoEntityManager.find(Employee.class, id);
        // delete employee by id
        employeeDaoEntityManager.remove(employee);
    }
}
