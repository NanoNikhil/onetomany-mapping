package com.mapping.bo;

public class ProjectEngineerResponseBO {

    private String projectName;
    private String projectCode;
    private String engineerName;
    private String email;
    private String temp;
    private String loc;
    
    

    public ProjectEngineerResponseBO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectEngineerResponseBO(String projectName, String projectCode, String engineerName, String email,
			String temp, String loc) {
		super();
		this.projectName = projectName;
		this.projectCode = projectCode;
		this.engineerName = engineerName;
		this.email = email;
		this.temp = temp;
		this.loc = loc;
	}

	public ProjectEngineerResponseBO(String projectName, String projectCode, String engineerName, String email) {
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.engineerName = engineerName;
        this.email = email;
    }

    public ProjectEngineerResponseBO(String projectName, String engineerName) {
        this.projectName = projectName;
        this.engineerName = engineerName;
    }

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}


}