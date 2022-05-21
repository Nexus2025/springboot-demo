package com.roman.springboot.demo.springboot_demo.service;


import com.roman.springboot.demo.springboot_demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
