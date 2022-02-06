package com.lms.exception;

public class EmployeeLogin extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid Username or Password";
	}

}
