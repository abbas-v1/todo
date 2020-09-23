package com.abbas.todo.service;

import com.abbas.todo.entity.Todo;
import com.abbas.todo.repository.TodoRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Service for To-Do
 *
 * @author abbas
 */
@Service
@Slf4j
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void createTodo(String task) {
        log.debug("Create new todo by task : {}", task);
        Todo todo = new Todo();
        todo.setTask(task);
        todo.setProjectId(1);
        todo.setUserId(2);
        todo.setCompleted(Boolean.FALSE);
        todoRepository.save(todo);
    }

    public void changeTodoStatus(int todoId, boolean isComplete) {
        log.debug("Change todo by id : {} to : {}", todoId, isComplete);
        Todo todo = todoRepository.getOne(todoId);
        todo.setCompleted(isComplete);
        todoRepository.save(todo);
    }

    public void deleteTodo(int todoId) {
        log.debug("Delete todo by id : {}", todoId);
        todoRepository.deleteById(todoId);
    }

    public List<Todo> getAllToDos() {
        log.debug("Get all ToDo's");
        return todoRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public List<Todo> getTodoByProject(Integer projectId) {
        log.debug("Get Todo's by project id : {}", projectId);
        return todoRepository.findByProjectId(projectId);
    }

    public List<Todo> getTodoByUser(Integer userId) {
        log.debug("Get Todo's by user id : {}", userId);
        return todoRepository.findByUserId(userId);
    }

}
