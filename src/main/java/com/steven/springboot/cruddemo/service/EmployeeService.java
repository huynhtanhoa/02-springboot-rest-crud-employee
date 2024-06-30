package com.steven.springboot.cruddemo.service;

import com.steven.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    // find by ID
    Employee findById(int theId);

    // update
    Employee save(Employee theEmployee);

    // delete
    void deleteById(int theId);
}
