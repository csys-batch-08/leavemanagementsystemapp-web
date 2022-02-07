package com.lms.daoimpl;


import com.lms.dao.EmpDao;
import com.lms.logger.Logger;
import com.lms.model.*;
import com.lms.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {

	public int resister(EmpLogin log) {

		
		int row=0;
		String insertQuery = "insert into LMS_EMPLOYEE(emp_name,emp_department,emp_email,emp_password) values(?,?,?,?)";

		Connection con=null;
		PreparedStatement pstmt =null;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(insertQuery);

			pstmt.setString(1, log.getEmp_name());
			pstmt.setString(2, log.getEmp_department());
			pstmt.setString(3, log.getEmp_email());
			pstmt.setString(4, log.getEmp_password());
			row= pstmt.executeUpdate();
			
		}catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}
		return row;
	}

	public EmpLogin validateLogin(EmpLogin user) {
		EmpLogin login=null;
        ResultSet rs=null;
        String insertQuery2 = "select emp_id, emp_name,emp_department,emp_email,emp_password from LMS_EMPLOYEE where  emp_name=? and emp_password=?";
        PreparedStatement pstmt = null;
		Connection con=null;
		try {
			con = ConnectionUtil.getConnection();
		    pstmt = con.prepareStatement(insertQuery2);
		    pstmt.setString(1, user.getEmp_name());
			pstmt.setString(2, user.getEmp_password());

			 rs = pstmt.executeQuery();
				if(rs.next()) {
			        login=new EmpLogin(rs.getString("emp_name"),rs.getString("emp_password"));
			        login.setEmp_id(rs.getInt("emp_id"));
						}
			

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(rs, pstmt, con);
		
	}

		return login;
		
	}
	public void addleave(EmpLogin log) {

	   int row=0;
		String insertQuery = "insert into leave_bal(emp_id)values(?)";
		PreparedStatement pstmt =null;
		Connection con=null;
		try {
			con = ConnectionUtil.getConnection();
		    pstmt = con.prepareStatement(insertQuery);
            pstmt.setInt(1, log.getEmp_id());
		    row = pstmt.executeUpdate();
			
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}}
	
	public List<EmpLogin> userview(int userid) {
		List<EmpLogin> userDetails = new ArrayList<>();
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

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(rs, pstmt, con);
		
	}
		

		return userDetails;

	}
	
		
}
