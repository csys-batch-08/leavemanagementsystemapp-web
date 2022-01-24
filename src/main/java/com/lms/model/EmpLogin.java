package com.lms.model;

public class EmpLogin {
	
	private int emp_id;
	private String emp_name;
	private String emp_department;
	private String emp_email;
	private String emp_password;
	private String users_type;
	
	
	
	public String getUsers_type() {
		return users_type;
	}
	public void setUsers_type(String users_type) {
		this.users_type = users_type;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_department() {
		return emp_department;
	}
	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getEmp_password() {
		return emp_password;
	}
	public void setEmp_password(String emp_password) {
		this.emp_password = emp_password;
	}
	public EmpLogin() {
		super();
	
	}
	public EmpLogin(String emp_name, String emp_department, String emp_email, String emp_password) {
		super();
		this.emp_name = emp_name;
		this.emp_department = emp_department;
		this.emp_email = emp_email;
		this.emp_password = emp_password;
	}
	public EmpLogin(String emp_name, String emp_password) {
		super();
		this.emp_name = emp_name;
		this.emp_password = emp_password;
	}
	public EmpLogin(String emp_department,int emp_id ) {
		super();
		this.emp_id = emp_id;
		this.emp_department = emp_department;
	}
	public EmpLogin(int emp_id) {
		super();
		this.emp_id = emp_id;
	}
	public EmpLogin(int emp_id, String emp_name, String emp_department, String emp_email, String emp_password,
			String users_type) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_department = emp_department;
		this.emp_email = emp_email;
		this.emp_password = emp_password;
		this.users_type = users_type;
	}
	
	
}
	
	


