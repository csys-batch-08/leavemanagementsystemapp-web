package com.lms.model;

import java.util.Date;

public class LeaveRes {

	private int requestId;
	private int empId;
	private String reason;
	private Date fromDate;
	private Date toDate;
	private int noOfdays;
	private String status;

	

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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getNoOfdays() {
		return noOfdays;
	}

	public void setNoOfdays(int noOfdays) {
		this.noOfdays = noOfdays;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LeaveRes() {
		super();

	}

	

	public LeaveRes(int requestId, int empId, String reason, Date fromDate, Date toDate, int noOfdays, String status) {
		super();
		this.requestId = requestId;
		this.empId = empId;
		this.reason = reason;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.noOfdays = noOfdays;
		this.status = status;
	}



	public LeaveRes(int empId, Date fromDate, Date toDate, int noOfdays) {
		super();
		this.empId = empId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.noOfdays = noOfdays;
	}

	public LeaveRes(int requestId) {
		super();
		this.requestId = requestId;
	}

	public LeaveRes(int empId, String reason, Date fromDate, Date toDate, int noOfdays) {
		super();
		this.empId = empId;
		this.reason = reason;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.noOfdays = noOfdays;
	}

	public LeaveRes(int requestId, String status) {
		super();
		this.requestId = requestId;
		this.status = status;
	}

}
