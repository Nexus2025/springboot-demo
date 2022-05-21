package com.roman.springboot.demo.springboot_demo.dao;

import com.roman.springboot.demo.springboot_demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
//        Session session = entityManager.unwrap(Session.class);
//        List<Employee> allEmployees = session.createQuery("FROM Employee", Employee.class)
//                .getResultList();

        Query query = entityManager.createQuery("FROM Employee");
        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(employee);
        Employee employeeFromBd = entityManager.merge(employee);
        employee.setId(employeeFromBd.getId());

    }

    @Override
    public Employee getEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class, id);
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Query<Employee> query = session.createQuery("DELETE FROM Employee WHERE id =:empId");
//        query.setParameter("empId", id);
//        query.executeUpdate();

        Query query = entityManager.createQuery("DELETE FROM Employee WHERE id =:empId");
        query.setParameter("empId", id);
        query.executeUpdate();
    }
}