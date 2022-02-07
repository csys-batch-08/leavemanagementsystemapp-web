package com.lms.dao;

import java.sql.ResultSet;

import com.lms.model.EmpLogin;

public interface EmpDao {

	public int resister(EmpLogin log);

	public EmpLogin validateLogin(EmpLogin user);

}
