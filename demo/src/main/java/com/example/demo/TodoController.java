package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    private List<Todo> todos;

    public TodoController() {
        todos = new ArrayList<>();
        todos.add(new Todo(1,"ab","cd",2));
        todos.add(new Todo(2,"ab","cd",2));
        todos.add(new Todo(3,"ab","cd",2));
    }

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return todos;
    }
}
