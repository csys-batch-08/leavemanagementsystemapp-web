package com.lms.model;

public class DeleteEmployee {
	
	private int emp_id;
	private String emp_name;
	private String emp_department;
	private String emp_email;
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
	public DeleteEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeleteEmployee(int emp_id, String emp_name, String emp_department, String emp_email) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_department = emp_department;
		this.emp_email = emp_email;
	}
	
	
	
	

}
