package com.lms.dao;

import com.lms.model.Admin;
import com.lms.model.EmpLogin;

public interface AdminDao {
	public Admin insert(Admin o1);

	public Admin validateAdminlogin(Admin user);

	public EmpLogin insertUser(EmpLogin e1);

	public EmpLogin updateUser(EmpLogin e2);

	public EmpLogin deleteUser(EmpLogin e3);

}
