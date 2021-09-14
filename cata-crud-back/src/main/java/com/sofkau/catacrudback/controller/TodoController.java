package com.sofkau.catacrudback.controller;

import com.sofkau.catacrudback.entities.Todo;
import com.sofkau.catacrudback.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping(value = "api/todos")
    public Iterable<Todo>list(){
        return service.list();
    }

    public Todo save(Todo todo){
        return service.save(todo);
    }
    public void delete(Long id) {
        service.delete(id);
    }
    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable Long id){
        return service.get(id);
    }
}
