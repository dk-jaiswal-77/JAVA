package com.dj.springboot.cruddemo.rest;

import com.dj.springboot.cruddemo.entity.Employee;
import com.dj.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
    // inject employee dao (use constructor injection)
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        this.employeeService = theEmployeeService;
    }

    // expose "/employees" endpoint & return a list of all the employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    // add mapping for GET /employees/{employeeId}
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);
        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        return theEmployee;
    }

    // add mapping for POST /employees - add  new employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        // just in case they pass id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        theEmployee.setId(0);
        Employee dbEmployee = this.employeeService.save(theEmployee);
        return dbEmployee;
    }

    // add mapping for PUT "/employees" - update an existing employee
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    // add mapping for DELETE "/employees/{employeeId}" - delete an existing employee
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);
        // throw exception if null
        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "deleted employee with id - " + employeeId;
    }
}