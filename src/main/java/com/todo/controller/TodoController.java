package com.todo.controller;

import com.todo.entities.Todo;
import com.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;


    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo saveTodo(@RequestBody Todo todo){
        return todoService.saveTodo(todo);
    }

    @PutMapping
    public Boolean markCompleted(@RequestBody String[] ids) {
    	return todoService.markCompleted(ids);
    }
    
    @DeleteMapping
    public Boolean deleteTodo(@RequestBody String todoId){
       return todoService.deleteTodo(todoId);
    	
    }

}
