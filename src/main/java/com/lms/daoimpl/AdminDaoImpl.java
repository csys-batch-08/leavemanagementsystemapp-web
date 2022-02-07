package com.lms.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.lms.dao.AdminDao;
import com.lms.logger.Logger;
import com.lms.model.*;
import com.lms.util.*;

public class AdminDaoImpl implements AdminDao {

	public Admin insert(Admin o1) {

		Admin admin = new Admin();
		int row= 0;
		PreparedStatement pstmt=null;
		String insertQuery = "insert into LMS_ADMIN values(?,?,?,?,?)";

		Connection con=null;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(insertQuery);

			pstmt.setInt(1, o1.getManager_id());
			pstmt.setString(2, o1.getManager_name());
			pstmt.setString(3, o1.getManager_email());
			pstmt.setString(4, o1.getManager_password());
			pstmt.setString(5, o1.getManager_department());
			row = pstmt.executeUpdate();
			

		}catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		}
		return admin;
	}

	public Admin validateAdminlogin(Admin user) {
		Admin admin=null;
		String insertQuery1 = "select manager_id,manager_password from LMS_admin where manager_id=? and manager_password=?";
		ResultSet rs=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con = ConnectionUtil.getConnection();
		 pstmt = con.prepareStatement(insertQuery1);
			pstmt.setInt(1, user.getManager_id());
			pstmt.setString(2, user.getManager_password());

			rs = pstmt.executeQuery();
			if(rs.next()) {
        admin=new Admin(rs.getInt("manager_id"),rs.getString("manager_password"));
        
			}

		}catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} 
			  finally {
			  
			  ConnectionUtil.close(rs, pstmt,con ); 
			  }
			 
 

		
			return admin;
		
	}

//insert
	public EmpLogin insertUser(EmpLogin e1) {
		EmpLogin login = new EmpLogin();
		String insertQuery = "insert into LMS_EMPLOYEE (emp_name,emp_department,emp_email,emp_password) values(?,?,?,?)";

		int row = 0;
		Connection con=null;
		PreparedStatement pstmt =null;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(insertQuery);

			pstmt.setString(1, e1.getEmp_name());
			pstmt.setString(2, e1.getEmp_department());
			pstmt.setString(3, e1.getEmp_email());
			pstmt.setString(4, e1.getEmp_password());
			row = pstmt.executeUpdate();
		

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}return login;
	}

	// UPDATE:
	public EmpLogin updateuser(EmpLogin e2) {
		EmpLogin login = new EmpLogin();
		String insertQuery = "update LMS_EMPLOYEE set  emp_department=? where emp_id=?";
		Connection con =null;
		PreparedStatement pstmt =null;
		int row=0;
		try {
			con = ConnectionUtil.getConnection();
		    pstmt = con.prepareStatement(insertQuery);
			pstmt.setString(1, e2.getEmp_department());
			pstmt.setInt(2, e2.getEmp_id());
			row = pstmt.executeUpdate();
		

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}
		return login;

	}

	// delete
	public EmpLogin deleteuser(EmpLogin e3) {
		String insertQuery = "delete from LMS_EMPLOYEE where emp_id=?";
		EmpLogin login = new EmpLogin();
		Connection con=null;
		PreparedStatement pstmt =null;
		int row=0;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, e3.getEmp_id());
			row = pstmt.executeUpdate();
			
		}catch (Exception e) {

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
		ResultSet rs =null;
		PreparedStatement pstmt =null;
		Connection con=null;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(empshow);
			 rs = pstmt.executeQuery(empshow);
			while (rs.next()) {
				emplog = new EmpLogin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
				emplogin.add(emplog);
			}
			return emplogin;
		}catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(rs, pstmt, con);
		
	}

		return emplogin;

	}

}
