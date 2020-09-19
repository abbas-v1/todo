package com.abbas.todo.service;

import com.abbas.todo.entity.Project;
import com.abbas.todo.repository.ProjectRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for Project
 *
 * @author abbas
 */
@Service
@Slf4j
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public void createProject(String projectName) {
        log.debug("Create new project by name : {}", projectName);
        Project project = new Project();
        project.setProjectName(projectName);
        projectRepository.save(project);
    }

    public List<Project> getAllProjects() {
        log.debug("Get all projects");
        return projectRepository.findAll();
    }

    public Project getProject(String projectName) {
        log.debug("Get project by name : {}", projectName);
        return projectRepository.findByProjectName(projectName);
    }

}
