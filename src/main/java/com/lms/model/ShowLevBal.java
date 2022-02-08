package com.lms.model;

public class ShowLevBal {

	private int empId;
	private int casualLeave;
	private int medicalLeave;
	private int casualBalance;
    private int medicalBalance;
	private int paidLeave;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getCasualLeave() {
		return casualLeave;
	}

	public void setCasualLeave(int casualLeave) {
		this.casualLeave = casualLeave;
	}

	public int getMedicalLeave() {
		return medicalLeave;
	}

	public void setMedicalLeave(int medicalLeave) {
		this.medicalLeave = medicalLeave;
	}

	public int getCasualBalance() {
		return casualBalance;
	}

	public void setCasualBalance(int casualBalance) {
		this.casualBalance = casualBalance;
	}

	public int getMedicalBalance() {
		return medicalBalance;
	}

	public void setMedicalBalance(int medicalBalance) {
		this.medicalBalance = medicalBalance;
	}

	public int getPaidLeave() {
		return paidLeave;
	}

	public void setPaidLeave(int paidLeave) {
		this.paidLeave = paidLeave;
	}

	public ShowLevBal() {
		super();

	}



	public ShowLevBal(int empId, int casualLeave, int medicalLeave, int casualBalance, int medicalBalance,
			int paidLeave) {
		super();
		this.empId = empId;
		this.casualLeave = casualLeave;
		this.medicalLeave = medicalLeave;
		this.casualBalance = casualBalance;
		this.medicalBalance = medicalBalance;
		this.paidLeave = paidLeave;
	}

	public ShowLevBal(int empId, int casualBalance, int medicalBalance, int paidLeave) {

		this.empId = empId;

		this.casualBalance = casualBalance;
		this.medicalBalance = medicalBalance;
		this.paidLeave = paidLeave;
	}

	public ShowLevBal(int casualLeave, int empId) {
		super();
		this.empId = empId;
		this.casualLeave = casualLeave;
	}

	public ShowLevBal(int medicalLeave, int empId, int medicalBalance) {
		super();
		this.empId = empId;
		this.medicalLeave = medicalLeave;
		this.medicalBalance = medicalBalance;
	}

	public ShowLevBal(int empId, int casualLeave, int medicalLeave, int medicalBalance, int paidLeave) {
		super();
		this.empId = empId;
		this.casualLeave = casualLeave;
		this.medicalLeave = medicalLeave;
		this.medicalBalance = medicalBalance;
		this.paidLeave = paidLeave;
	}

	public ShowLevBal(int empId) {
		super();
		this.empId = empId;
	}

}
