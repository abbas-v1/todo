package com.abbas.todo.repository;

import com.abbas.todo.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Project
 *
 * @author abbas
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

    Project findByProjectName(String projectName);

}
