package com.example.todo.controller;

import com.example.todo.entity.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/todo")
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping
    public Iterable<Todo> getAllTodo() {
        return todoRepository.findAll();
    }
}
