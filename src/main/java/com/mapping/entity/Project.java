package com.mapping.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Project {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;
    private String name;
    private String projectCode;
    @OneToMany(
            cascade = CascadeType.ALL
           // orphanRemoval = true//or CascadeType.ALL
    )
    @JoinColumn(name = "project_engineer_fk",referencedColumnName = "projectId")
    private List<Engineer> engineers;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(Integer projectId, String name, String projectCode, List<Engineer> engineers) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.projectCode = projectCode;
		this.engineers = engineers;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public List<Engineer> getEngineers() {
		return engineers;
	}
	public void setEngineers(List<Engineer> engineers) {
		this.engineers = engineers;
	}
    
    
}