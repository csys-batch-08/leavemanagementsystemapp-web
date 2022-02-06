package com.lms.dao;

import java.sql.ResultSet;

import com.lms.model.EmpLogin;

public interface EmpDao {

	public int resister(EmpLogin log);

	public ResultSet validateLogin(EmpLogin user);

}
