package com.lms.model;

public class LevStatus {

	private int managerId;
	private int requestId;
	private int empId;
	private String status;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LevStatus() {
		super();
	}

	public LevStatus(int managerId, int requestId, int empId, String status) {
		super();
		this.managerId = managerId;
		this.requestId = requestId;
		this.empId = empId;
		this.status = status;
	}

	public LevStatus(int managerId, int empId) {
		super();
		this.managerId = managerId;
		this.empId = empId;
	}

	public LevStatus(String status, int requestId) {
		super();
		this.requestId = requestId;
		this.status = status;
	}

	public LevStatus(int requestId) {
		super();
		this.requestId = requestId;
	}

	public LevStatus(int manager_id, int request_id, int emp_id) {
		super();
		this.managerId = manager_id;
		this.requestId = request_id;
		this.empId = emp_id;
	}

}
