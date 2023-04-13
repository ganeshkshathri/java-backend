// Write your code here
package com.example.employee;
import com.example.employee.Employee;
import java.util.*;

public interface EmployeeRepository{
    ArrayList<Employee> getAllEmployees();
    Employee addNewEmployee( Employee employee);
    Employee getEmployee(int employeeID);
    Employee updateEmployee(int employeeID,Employee employee);
    void deleteEmployee(int employeeId);
}