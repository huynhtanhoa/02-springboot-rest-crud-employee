package com.steven.springboot.cruddemo.dao;

import com.steven.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    // define methods
    List<Employee> findAll();

    // find by ID
    Employee findById(int theId);

    // update
    Employee save(Employee theEmployee);

    // delete
    void deleteById(int theId);


}
