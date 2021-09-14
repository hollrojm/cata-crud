package com.sofkau.catacrudback.repository;

import com.sofkau.catacrudback.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
