package com.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.bo.ProjectEngineerResponseBO;
import com.mapping.entity.Engineer;
import com.mapping.entity.Project;
import com.mapping.repository.EngineerRepository;
import com.mapping.repository.ProjectRepository;

@Service
public class ProjectManagementService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private EngineerRepository engineerRepository;


    public Project saveProject(Project project){
        return projectRepository.save(project);
    }

    public List<Project> getProjects(){
        return projectRepository.findAll();
    }

    public List<Engineer> getEngineers(){
        return engineerRepository.findAll();
    }

    public String deleteProject(int projectId){
        projectRepository.deleteById(projectId);
        return "project "+projectId+" deleted !!!";
    }

	public List<Project> saveProjects(List<Project> projects) {
		
		return projectRepository.saveAll(projects);
	}


//    public List<ProjectEngineerResponseBO> getProjectSpecificInfoSQL(){
//        return projectRepository.getProjectSpecificInfoWithSQL();
//    }
//
//    public List<ProjectEngineerResponseBO> getProjectSpecificInfoJPQL(){
//        return projectRepository.getProjectSpecificInfoWithJPQL();
//    }




}