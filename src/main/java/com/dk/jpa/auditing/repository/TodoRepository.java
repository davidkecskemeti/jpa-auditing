package com.dk.jpa.auditing.repository;

import com.dk.jpa.auditing.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
