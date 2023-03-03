package com.example.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.model.Todo;

// @Repository
public interface TodoInterface extends JpaRepository<Todo, Integer>{
    
}
