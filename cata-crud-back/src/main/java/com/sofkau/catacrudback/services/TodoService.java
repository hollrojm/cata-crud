package com.sofkau.catacrudback.services;

import com.sofkau.catacrudback.entities.Todo;
import com.sofkau.catacrudback.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class TodoService {

    @Autowired
    private TodoRepository repository;


    public Iterable<Todo>list(){
        return repository.findAll();
    }
    public Todo save(Todo todo){
        return repository.save(todo);
}
    public void delete(Long id) {
        repository.delete(get(id));
    }
    public Todo get(Long id){
        return repository.findById(id).orElseThrow();
    }
}