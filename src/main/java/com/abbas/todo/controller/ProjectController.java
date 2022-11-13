package com.abbas.todo.controller;

import com.abbas.todo.entity.Project;
import com.abbas.todo.service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for Project
 *
 * @author abbas
 */
@RestController
@RequestMapping("/project")
@CrossOrigin(origins = "${cross.origin}")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public void createProject(@RequestBody String projectName) {
        projectService.createProject(projectName);
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{projectName}")
    public Project getProject(@PathVariable("projectName") String projectName) {
        return projectService.getProject(projectName);
    }

}
