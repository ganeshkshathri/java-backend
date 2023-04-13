/*
 * You can use the following import statements
 * 
 * import org.springframework.web.server.ResponseStatusException;
 * import org.springframework.http.HttpStatus;
 * 
 */


 package com.example.employee;

 import com.example.employee.Employee;
 import com.example.employee.EmployeeRepository;
 
 import java.util.*;
 
 
 import javax.validation.OverridesAttribute;
  import org.springframework.web.server.ResponseStatusException;
  import org.springframework.http.HttpStatus;
 
 // Do not modify the below code
 
 public class EmployeeService implements EmployeeRepository {
 
     private static HashMap<Integer, Employee> employeeList = new HashMap<>();
     int uniqueValue=7;
 
     public EmployeeService() {
         employeeList.put(1, new Employee(1, "John Doe", "johndoe@example.com", "Marketing"));
         employeeList.put(2, new Employee(2, "Jane Smith", "janesmith@example.com", "Human Resources"));
         employeeList.put(3, new Employee(3, "Bob Johnson", "bjohnson@example.com", "Sales"));
         employeeList.put(4, new Employee(4, "Alice Lee", "alee@example.com", "IT"));
         employeeList.put(5, new Employee(5, "Mike Brown", "mbrown@example.com", "Finance"));
         employeeList.put(6, new Employee(6, "Sara Lee", "slee@example.com", "Operations"));
 
     }
 
     // Do not modify the above code
 
     // Write your code here
     @Override
     public ArrayList<Employee> getAllEmployees(){
         Collection<Employee> employeeCollection = employeeList.values();
         ArrayList<Employee> allemployees = new ArrayList<>(employeeCollection);
         return allemployees;
     }
     @Override
     public Employee addNewEmployee( Employee employee){
         employee.setEmployeeId(uniqueValue);
         employeeList.put(uniqueValue,employee);
         uniqueValue+=1;
         return employee;
     }
     @Override 
     public Employee getEmployee(int employeeID){
         if(employeeList.get(employeeID)==null){
             throw new ResponseStatusException(HttpStatus.NOT_FOUND);
         }
             return employeeList.get(employeeID);
     }
     @Override 
     public Employee updateEmployee(int employeeID,Employee employee){
             Employee existingEmployee = employeeList.get(employeeID);
             if(existingEmployee==null){
                 throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                 
             }else{
                 if(employee.getEmployeeName()!=null){
                     existingEmployee.setEmployeeName(employee.getEmployeeName());
                 }
                 if(employee.getDepartment()!=null){
                     existingEmployee.setDepartment(employee.getDepartment());
                 }
                 if(employee.getEmail()!=null){
                     existingEmployee.setEmail(employee.getEmail());
                 }
             }
             return existingEmployee;
 
     }
     @Override
     public void deleteEmployee(int employeeId){
         if(employeeList.get(employeeId)==null){
             throw new ResponseStatusException(HttpStatus.NOT_FOUND);
 
         }else{
             employeeList.remove(employeeId);
             throw new ResponseStatusException(HttpStatus.NO_CONTENT);
         }
     }
 }
 