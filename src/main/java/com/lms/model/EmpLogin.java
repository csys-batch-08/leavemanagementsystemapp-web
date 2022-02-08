package com.lms.model;

public class EmpLogin {

	private int empId;
	private String empName;
	private String empDepartment;
	private String empEmail;
	private String empPassword;
	private String usersType;

	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public String getUsersType() {
		return usersType;
	}

	public void setUsersType(String usersType) {
		this.usersType = usersType;
	}

	public EmpLogin() {
		super();

	}

	public EmpLogin(String empName, String empDepartment, String empEmail, String empPassword) {
		super();
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empEmail = empEmail;
		this.empPassword = empPassword;
	}

	public EmpLogin(String empName, String empPassword) {
		super();
		this.empName = empName;
		this.empPassword = empPassword;
	}

	public EmpLogin(String empDepartment, int empId) {
		super();
		this.empId = empId;
		this.empDepartment = empDepartment;
	}

	public EmpLogin(int empId) {
		super();
		this.empId = empId;
	}

	public EmpLogin(int empId, String empName, String empDepartment, String empEmail, String empPassword,
			String usersType) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empEmail = empEmail;
		this.empPassword =empPassword;
		this.usersType = usersType;
	}

	public EmpLogin(int empId, String empName, String empDepartment, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment =empDepartment;
		this.empEmail = empEmail;
	}

}
