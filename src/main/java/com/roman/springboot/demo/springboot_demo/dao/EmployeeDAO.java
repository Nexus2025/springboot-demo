package com.roman.springboot.demo.springboot_demo.dao;

import com.roman.springboot.demo.springboot_demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
