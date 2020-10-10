package com.dk.jpa.auditing.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Todo extends BaseEntity<String> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private boolean completed;

    public Todo(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }
}
