package com.dj.springboot.cruddemo.dao;

import com.dj.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    private EntityManager theEntityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager) {
        this.theEntityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = theEntityManager.createQuery("FROM Employee", Employee.class);
        return theQuery.getResultList();
    }

    @Override
    public Employee findById(int theId) {
        Employee theEmployee = theEntityManager.find(Employee.class, theId);
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        // save Employee
        Employee dbEmployee = theEntityManager.merge(theEmployee);

        // return dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
        // find Employee by id
        Employee theEmployee = theEntityManager.find(Employee.class, theId);

        // remove employee
        theEntityManager.remove(theEmployee);
    }
}
