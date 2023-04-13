/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.employee;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.employee.*;

@RestController
public class EmployeeController{
    EmployeeService employeeService = new EmployeeService();
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