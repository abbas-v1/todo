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
@CrossOrigin(origins = "${cross.origin}")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public void createTodo(@RequestBody String task) {
        todoService.createTodo(task);
    }

    @PutMapping("/{todoId}")
    public void changeTodoStatus(@PathVariable("todoId") int todoId, @RequestBody boolean isComplete) {
        todoService.changeTodoStatus(todoId, isComplete);
    }

    @DeleteMapping("/{todoId}")
    public void deleteTodo(@PathVariable("todoId") int todoId) {
        todoService.deleteTodo(todoId);
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
