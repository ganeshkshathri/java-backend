// Write your code here
package com.example.todo;

import java.util.ArrayList;
import com.example.todo.Todo;

public interface TodoRepository{
    ArrayList<Todo> getAllTodoList();
    Todo addTodo(Todo todo);
    Todo getTodo(int id);
    Todo updateTodo(int id,Todo todo);
    void deleteTodo(int id);
}