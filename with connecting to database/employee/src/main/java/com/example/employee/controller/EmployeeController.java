package com.example.employee.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeH2Service;

import java.util.*;

@RestController
public class EmployeeController{
    @Autowired
    EmployeeH2Service employeeService;
    @GetMapping("/employees")
    public ArrayList<Employee> getallemployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public Employee addnewEmployee(@RequestBody Employee employee){
        return employeeService.addNewEmployee(employee);
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") int employeeID){
        return employeeService.getEmployee(employeeID);
    }
    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId") int employeeID,@RequestBody Employee employee){
        return employeeService.updateEmployee(employeeID,employee);
         
    }
    @DeleteMapping("/employees/{employeeId}")
    public ArrayList<Employee> deleteEmployee(@PathVariable("employeeId") int employeeId){
        employeeService.deleteEmployee(employeeId);
        return employeeService.getAllEmployees();
    }
}
