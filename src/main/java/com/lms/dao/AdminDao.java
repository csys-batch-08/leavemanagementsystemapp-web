package com.lms.dao;

import java.sql.ResultSet;

import com.lms.model.Admin;
import com.lms.model.EmpLogin;

public interface AdminDao {
	public Admin insert(Admin o1);

	public ResultSet validateAdminlogin(Admin user);

	public EmpLogin insertUser(EmpLogin e1);

	public EmpLogin updateuser(EmpLogin e2);

	public EmpLogin deleteuser(EmpLogin e3);

}
