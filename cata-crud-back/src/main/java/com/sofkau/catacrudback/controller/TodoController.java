package com.sofkau.catacrudback.controller;

import com.sofkau.catacrudback.entities.Todo;
import com.sofkau.catacrudback.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public final class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping(value = "api/todos")
    public Iterable<Todo>list(){
        return service.list();
    }
    @PostMapping("api/todo")
    public Todo save(Todo todo){
        return service.save(todo);
    }

    @PutMapping(value = "api/todos")
    public Todo update(@RequestBody Todo todo) {
        if (todo.getId() != null){
            return service.save(todo);
        }
        throw new RuntimeException("No existe el id para actualizar");


    }
    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id")Long id) {
        service.delete(id);
    }
    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable("id") Long id){
        return service.get(id);
    }
}
