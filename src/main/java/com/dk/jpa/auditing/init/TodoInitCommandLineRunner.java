package com.dk.jpa.auditing.init;

import com.dk.jpa.auditing.entity.Todo;
import com.dk.jpa.auditing.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class TodoInitCommandLineRunner implements CommandLineRunner {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public void run(String... args) throws Exception {
        todoRepository.saveAll(Arrays.asList(
                new Todo("Learn Java", true),
                new Todo("Learn Spring Boot", true),
                new Todo("Master Spring Boot", false),
                new Todo("Learn React", true),
                new Todo("Learn Angular", true)
        ));
        Iterable<Todo> todos = todoRepository.findAll();
        todos.forEach(System.out::println);
    }
}
