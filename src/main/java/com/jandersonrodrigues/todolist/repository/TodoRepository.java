package com.jandersonrodrigues.todolist.repository;

import com.jandersonrodrigues.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
