package com.mapping.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mapping.bo.ProjectEngineerResponseBO;
import com.mapping.entity.Engineer;
import com.mapping.entity.Project;
import com.mapping.service.ProjectManagementService;

@RestController
public class ProjectManagementController {

    @Autowired
    private ProjectManagementService service;

    @PostMapping("/projects")
    public Project addNewProject(@RequestBody Project project) {
        return service.saveProject(project);
    }
    
    @PostMapping("/multiprojects")
    public List<Project> addNewProjects(@RequestBody List<Project> projects) {
        return service.saveProjects(projects);
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return service.getProjects();
    }

    @GetMapping("/engineers")
    public List<Engineer> getEngineers() {
        return service.getEngineers();
    }

    @DeleteMapping("/project/{projectId}")
    public String deleteProject(@PathVariable int projectId) {
        return service.deleteProject(projectId);
    }

//    @GetMapping("/join/sql")
//    public List<ProjectEngineerResponseBO> getProjectSpecificInfoSQL(){
//        return service.getProjectSpecificInfoSQL();
//    }
//    @GetMapping("/join/jpql")
//    public List<ProjectEngineerResponseBO> getProjectSpecificInfoJPQL(){
//        return service.getProjectSpecificInfoJPQL();
//    }


}