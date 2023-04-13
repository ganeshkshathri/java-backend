/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.todo;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.todo.*;

@RestController
public class TodoController{
    TodoService todoService=new TodoService();
    @GetMapping("/todos")
    public ArrayList<Todo> getallTodoList(){
        return todoService.getAllTodoList();
    }
    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }
    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable("id") int id){
        return todoService.getTodo(id);
    }
    @PutMapping("/todos/{id}")
    public Todo updateTodo(@PathVariable("id") int id,@RequestBody Todo todo){
        return todoService.updateTodo(id,todo);
    }
    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable("id") int id){
        todoService.deleteTodo(id);
    }

}


