package com.lms.daoimpl;


import com.lms.dao.EmpDao;
import com.lms.model.*;
import com.lms.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {

	public int resister(EmpLogin log) {

		//EmpLogin login = new EmpLogin();
		int i=0;
		String insertQuery = "insert into LMS_EMPLOYEE(emp_name,emp_department,emp_email,emp_password) values(?,?,?,?)";

		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);

			pstmt.setString(1, log.getEmp_name());
			pstmt.setString(2, log.getEmp_department());
			pstmt.setString(3, log.getEmp_email());
			pstmt.setString(4, log.getEmp_password());
			i = pstmt.executeUpdate();
			System.out.println(i + "inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public ResultSet validateLogin(EmpLogin user) {
		
        ResultSet rs=null;
        String insertQuery2 = "select emp_id, emp_name,emp_department,emp_email,emp_password from LMS_EMPLOYEE where  emp_name=? and emp_password=?";
		
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery2);
			
			
            
			pstmt.setString(1, user.getEmp_name());
			pstmt.setString(2, user.getEmp_password());

			 rs = pstmt.executeQuery();
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;
		
	}
	public void addleave(EmpLogin log) {

		//EmpLogin login = new EmpLogin();
		String insertQuery = "insert into leave_bal(emp_id)values(?)";

		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
            pstmt.setInt(1, log.getEmp_id());
		    int i = pstmt.executeUpdate();
			System.out.println(i + "inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
	public List<EmpLogin> userview(int userid) {
		List<EmpLogin> userDetails = new ArrayList<EmpLogin>();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		String usershow ="select emp_id, emp_name,emp_department,emp_email from LMS_EMPLOYEE where  emp_id=?";
		try {

			con = ConnectionUtil.getConnection();

			pstmt = con.prepareStatement(usershow);
			pstmt.setInt(1, userid);
			rs = pstmt.executeQuery();
			while (rs.next()) {

				EmpLogin user = new EmpLogin (rs.getInt("emp_id"), rs.getString("emp_name"), rs.getString("emp_department"),
						rs.getString("emp_email"));
				userDetails.add(user);

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (rs != null) {

					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				
				if (con != null) {
					con.close();
				}
			}

			catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return userDetails;

	}
	
		
}
