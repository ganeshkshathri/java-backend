// Write your code here
package com.example.todo;

public class Todo{
    private int id;
    private String todo;
    private String priority;
    private String status;

    //constructor 
    public Todo(int id,String todo,String priority,String status){
        this.id=id;
        this.todo=todo;
        this.priority=priority;
        this.status=status;
    }
    //getter and setters for id
    public void setId(int id){
        this.id=id;

    }
    public int getId(){
        return this.id;
    }
    //getters and setters for todo
    public void setTodo(String todo){
        this.todo=todo;
    }
    public String getTodo(){
        return this.todo;
    }
    //getters and setter for priority
    public void setPriority(String priority){
        this.priority=priority;

    }
    public String getPriority(){
        return this.priority;
    }
    //getters and setters for status
    public void setStatus(String status){
        this.status=status;
    }
    public String getStatus(){
        return this.status;
    }
}