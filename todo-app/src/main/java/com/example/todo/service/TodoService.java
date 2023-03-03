package com.example.todo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.model.Todo;
import com.example.todo.repository.TodoInterface;

@Service
public class TodoService implements  ITodoService {

    @Autowired
    TodoInterface repo;

    private static List<Todo> todos=new ArrayList<>();
    private static int todoCount=0;

    static {
        todos.add(new Todo(++todoCount,"Learn Spring Boot",false));
        todos.add(new Todo(++todoCount,"Visit Grocery Store",false));
    }

    @Override
    public List<Todo> findAll() { 
        return repo.findAll();
    }

    @Override
    public Todo findById(int id) { 
        return repo.findById(id).get();
    }

    @Override
    public void addTodo(Todo todo) {
        repo.save(todo);
    }

    @Override
    public void deleteTodo(int id) {
        repo.deleteById(id);
    }

    @Override
    public void updateTodo(int id,Todo newTodo) {
        Todo todo=findById(id);// step 1
        todo.setId(newTodo.getId());
        todo.setTitle(newTodo.getTitle());
        todo.setStatus(newTodo.isStatus());
        repo.save(todo);
    }

}



















// return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//return new ResponseEntity<>(todoService.getTodoById(todoId), HttpStatus.OK);
//return new ResponseEntity<>(todo, HttpStatus.CREATED);
/*

{
    "id":100,
    "title": "Buy eggs from supermarket",
    "status": false
}

Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;

Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);

 */