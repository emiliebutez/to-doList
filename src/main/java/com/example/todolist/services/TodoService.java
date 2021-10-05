package com.example.todolist.services;

import com.example.todolist.domain.Todo;
import com.example.todolist.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo insertTodo(String name, Date deadline, String employee) {
        Todo todo = new Todo(name, deadline, employee);
        return todoRepository.save(todo);
    }

    public Todo updateTodo(String name, Date deadline, String employee) {
        Todo todo = todoRepository.findById(name).orElse(null);
        todo.setDeadline(deadline);
        todo.setEmployee(employee);
        return todoRepository.save(todo);
    }

    public void deleteTodo(String name) {
        todoRepository.deleteById(name);
    }
}
