package com.lms.model;

public class Admin {

	private int managerId;
	private String managerName;
	private String managerEmail;
	private String managerPassword;
	private String managerDepartment;



	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerEmail() {
		return managerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}

	public String getManagerPassword() {
		return managerPassword;
	}

	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}

	public String getManagerDepartment() {
		return managerDepartment;
	}

	public void setManagerDepartment(String managerDepartment) {
		this.managerDepartment = managerDepartment;
	}

	public Admin() {
		super();

	}

	public Admin(int managerId, String managerName, String managerEmail, String managerPassword,
			String managerDepartment) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerEmail = managerEmail;
		this.managerPassword = managerPassword;
		this.managerDepartment = managerDepartment;
	}

	public Admin(int managerId, String managerPassword) {
		super();
		this.managerId = managerId;
		this.managerPassword = managerPassword;
	}

}
