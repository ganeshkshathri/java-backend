
package com.example.employee.repository;
import com.example.employee.model.Employee;
import java.util.*;

public interface EmployeeRepository{
    ArrayList<Employee> getAllEmployees();
    Employee addNewEmployee( Employee employee);
    Employee getEmployee(int employeeID);
    Employee updateEmployee(int employeeID,Employee employee);
    void deleteEmployee(int employeeId);
}