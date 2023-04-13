
 package com.example.employee.service;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.model.Employee;
import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.employee.model.EmployeeRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
 
 
 // Don't modify the below code
 
@Service
public class EmployeeH2Service implements EmployeeRepository{
    @Autowired
    private JdbcTemplate db;
    @Override 
    public ArrayList<Employee> getAllEmployees(){
        List<Employee> employeeList = db.query("SELECT * FROM EMPLOYEELIST",new EmployeeRowMapper());
        ArrayList<Employee> employeeLists = new ArrayList<>(employeeList);
        return employeeLists;

    }
    @Override
    public Employee getEmployee(int employeeID){
        try{
    Employee employee = db.queryForObject("Select * from EMPLOYEELIST where employeeId = ?",new EmployeeRowMapper(),employeeID);
    return employee;
    }catch(Exception e){
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    
    }
    @Override
    public Employee addNewEmployee( Employee employee){
        db.update("insert into EMPLOYEELIST( employeeName, email,  department) values (?,?,?)",employee.getEmployeeName(),employee.getEmail(),employee.getDepartment());
        Employee savedEmployee= db.queryForObject("select * from EMPLOYEELIST where employeeName = ? and email = ? and department = ?", new EmployeeRowMapper(),employee.getEmployeeName(),employee.getEmail(),employee.getDepartment());
        return savedEmployee;
    }
    @Override
    public Employee updateEmployee(int employeeID,Employee employee){
        if(employee.getEmployeeName()!=null){
        db.update("update EMPLOYEELIST set employeeName = ? where employeeId =?", employee.getEmployeeName(),employeeID);
        }
        if(employee.getEmail()!=null){
        db.update("update EMPLOYEELIST set email = ? where employeeId =?", employee.getEmail(),employeeID);
        }
        if(employee.getDepartment()!=null){
            db.update("update EMPLOYEELIST set department = ? where employeeId = ?", employee.getDepartment(),employeeID);
        }
       
        return getEmployee(employeeID);
    }
    @Override
    public void deleteEmployee(int employeeId){
        db.update("delete from EMPLOYEELIST where employeeId = ?", employeeId);
    }
     

}