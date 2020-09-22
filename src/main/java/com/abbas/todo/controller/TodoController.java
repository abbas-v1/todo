package com.abbas.todo.controller;

import com.abbas.todo.entity.Todo;
import com.abbas.todo.service.TodoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for ToDo
 *
 * @author abbas
 */
@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = "http://localhost:8080")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public void createTodo(String task) {
        task = "Task3";
        todoService.createTodo(task);
    }

    @GetMapping
    public List<Todo> getAllToDos() {
        return todoService.getAllToDos();
    }

    @GetMapping("/project/{projectId}")
    public List<Todo> getTodoByProject(@PathVariable("projectId") Integer projectId) {
        return todoService.getTodoByProject(projectId);
    }

    @GetMapping("/user/{userId}")
    public List<Todo> getTodoByUser(@PathVariable("userId") Integer userId) {
        return todoService.getTodoByUser(userId);
    }

}
