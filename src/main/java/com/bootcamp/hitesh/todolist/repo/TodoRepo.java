package com.bootcamp.hitesh.todolist.repo;

import com.bootcamp.hitesh.todolist.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}
