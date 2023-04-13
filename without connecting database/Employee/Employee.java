// Write your code here
package com.example.employee;
public class Employee{
    private int employeeId;
    private String employeeName;
    private String email;
    private String department;
    //constructor 
    public Employee(int employeeId , String employeeName,String email, String department){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.email=email;
        this.department=department;
    }

    //getter and settter for employeeId
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public int getEmployeeId(){
        return this.employeeId;

    }
    //getters ans setter for employee Name
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }
    //getter and setter for email
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    //getter and setter for department 
    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment(){
        return this.department;
    }

}