package com.abbas.todo;

import com.abbas.todo.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for To-Do
 *
 * @author abbas
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findByProjectId(Integer projectId);

    List<Todo> findByUserId(Integer userId);

}
