package com.lms.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lms.*;
import com.lms.dao.AdminDao;
import com.lms.model.*;
import com.lms.util.*;

public class AdminDaoImpl implements AdminDao {

	public Admin insert(Admin o1) {

		Admin admin = new Admin();
		int n = 0;
		String insertQuery = "insert into LMS_ADMIN values(?,?,?,?,?)";

		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);

			pstmt.setInt(1, o1.getManager_id());
			pstmt.setString(2, o1.getManager_name());
			pstmt.setString(3, o1.getManager_email());
			pstmt.setString(4, o1.getManager_password());
			pstmt.setString(5, o1.getManager_department());
			n = pstmt.executeUpdate();
			// System.out.println(i+ "inserted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
	}

	public ResultSet validateAdminlogin(Admin user) {
		Admin admin=null;
		String insertQuery1 = "select * from LMS_admin where manager_id=? and manager_password=?";
		ResultSet rs=null;
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery1);
System.out.println(user.getManager_id() + user.getManager_password());
			pstmt.setInt(1, user.getManager_id());
			pstmt.setString(2, user.getManager_password());

			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				admin=new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
//				
//			}
//			return admin;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
			return rs;
		
	}

	// insert:
	public EmpLogin insertUser(EmpLogin e1) {
		EmpLogin login = new EmpLogin();
		String insertQuery = "insert into LMS_EMPLOYEE (emp_name,emp_department,emp_email,emp_password) values(?,?,?,?)";

		int n = 0;
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);

			pstmt.setString(1, e1.getEmp_name());
			pstmt.setString(2, e1.getEmp_department());
			pstmt.setString(3, e1.getEmp_email());
			pstmt.setString(4, e1.getEmp_password());
			n = pstmt.executeUpdate();
			// System.out.println(i+ "inserted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return login;
	}

	// UPDATE:
	public EmpLogin updateuser(EmpLogin e2) {
		EmpLogin login = new EmpLogin();
		String insertQuery = "update LMS_EMPLOYEE set  emp_department=? where emp_id=?";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setString(1, e2.getEmp_department());
			pstmt.setInt(2, e2.getEmp_id());
			int i = pstmt.executeUpdate();
			System.out.println(i + "updated");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return login;

	}

	// delete
	public EmpLogin deleteuser(EmpLogin e3) {
		String insertQuery = "delete from LMS_EMPLOYEE where emp_id=?";
		EmpLogin login = new EmpLogin();
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, e3.getEmp_id());
			int i = pstmt.executeUpdate();
			System.out.println(i + "deleted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return login;

	}

	// show
	public List<EmpLogin> showEmployee() {
		List<EmpLogin> emplogin = new ArrayList<EmpLogin>();
		EmpLogin emplog = null;
		String empshow = "select*from LMS_EMPLOYEE";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(empshow);
			while (rs.next()) {
				emplog = new EmpLogin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
				emplogin.add(emplog);
			}
			return emplogin;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emplogin;

	}

}
