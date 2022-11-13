package com.abbas.project;

import com.abbas.project.Project;
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
