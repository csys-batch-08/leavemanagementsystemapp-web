package com.lms.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.lms.dao.AdminDao;
import com.lms.logger.Logger;
import com.lms.model.*;
import com.lms.util.*;

public class AdminDaoImpl implements AdminDao {

	public Admin insert(Admin o1) {

		Admin admin = new Admin();

		PreparedStatement pstmt = null;
		String insertQuery = "insert into LMS_ADMIN values(?,?,?,?,?)";

		Connection con = null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(insertQuery);

			pstmt.setInt(1, o1.getManagerId());
			pstmt.setString(2, o1.getManagerName());
			pstmt.setString(3, o1.getManagerEmail());
			pstmt.setString(4, o1.getManagerPassword());
			pstmt.setString(5, o1.getManagerDepartment());
			pstmt.executeUpdate();

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		}
		return admin;
	}

	public Admin validateAdminlogin(Admin user) {
		Admin admin = null;
		String insertQuery1 = "select manager_id,manager_password from LMS_admin where manager_id=? and manager_password=?";
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(insertQuery1);
			pstmt.setInt(1, user.getManagerId());
			pstmt.setString(2, user.getManagerPassword());

			rs = pstmt.executeQuery();
			if (rs.next()) {
				admin = new Admin(rs.getInt("manager_id"), rs.getString("manager_password"));

			}

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(rs, pstmt, con);
		}

		return admin;

	}

//insert
	public EmpLogin insertUser(EmpLogin e1) {
		EmpLogin login = new EmpLogin();
		String insertQuery = "insert into LMS_EMPLOYEE (emp_name,emp_department,emp_email,emp_password) values(?,?,?,?)";

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(insertQuery);

			pstmt.setString(1, e1.getEmpName());
			pstmt.setString(2, e1.getEmpDepartment());
			pstmt.setString(3, e1.getEmpEmail());
			pstmt.setString(4, e1.getEmpPassword());
			pstmt.executeUpdate();

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);

		}
		return login;
	}

	// UPDATE:
	public EmpLogin updateUser(EmpLogin e2) {
		EmpLogin login = new EmpLogin();
		String insertQuery = "update LMS_EMPLOYEE set  emp_department=? where emp_id=?";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(insertQuery);
			pstmt.setString(1, e2.getEmpDepartment());
			pstmt.setInt(2, e2.getEmpId());
			pstmt.executeUpdate();

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);

		}
		return login;

	}

	// delete
	public EmpLogin deleteUser(EmpLogin e3) {
		String insertQuery = "delete from LMS_EMPLOYEE where emp_id=?";
		EmpLogin login = new EmpLogin();
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, e3.getEmpId());
			pstmt.executeUpdate();

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);

		}
		return login;

	}

	// show
	public List<EmpLogin> showEmployee() {
		List<EmpLogin> emplogin = new ArrayList<>();
		EmpLogin emplog = null;
		String empshow = "select emp_id,emp_name,emp_department,emp_email,emp_password,users_type from LMS_EMPLOYEE";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(empshow);
			rs = pstmt.executeQuery(empshow);
			while (rs.next()) {
				emplog = new EmpLogin(rs.getInt("emp_id"), rs.getString("emp_name"), rs.getString("emp_department"), rs.getString("emp_email"), rs.getString("emp_password"),
						rs.getString("users_type"));
				emplogin.add(emplog);
			}
			return emplogin;
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(rs, pstmt, con);

		}

		return emplogin;

	}

}
