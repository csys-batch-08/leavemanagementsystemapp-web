package com.lms.daoimpl;


import com.lms.dao.LeaveResDao;
import com.lms.logger.Logger;
import com.lms.model.*;
import com.lms.util.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LeaveResDaoImpl implements LeaveResDao {

	public LeaveRes applyLeave(LeaveRes lev) {
		LeaveRes leave = new LeaveRes();
        int row=0;
		String insertQuery = "insert into LEAVE_RES(emp_id,reason,from_date,to_date,no_ofdays) values(?,?,?,?,?)";
		Connection con=null;
		PreparedStatement pstmt =null;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(insertQuery);

			pstmt.setInt(1, lev.getEmp_id());
			pstmt.setString(2, lev.getReason());
			pstmt.setDate(3, new java.sql.Date(lev.getFrom_date().getTime()));
			pstmt.setDate(4, new java.sql.Date(lev.getTo_date().getTime()));
		
			pstmt.setInt(5, lev.getNo_ofdays());
			row = pstmt.executeUpdate();
			
		}  catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}
		return leave;
	}

	// UPDATE:
	public LeaveRes updatelev(LeaveRes resq) {
		LeaveRes leave = new LeaveRes();
		String insertQuery = "update leave_res set  from_date=?,  to_date =? ,no_ofdays=? where emp_id=?";
		Connection con=null;
		PreparedStatement pstmt =null;
		int row=0;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(insertQuery);
			pstmt.setDate(1, new java.sql.Date(resq.getFrom_date().getTime()));
		    pstmt.setDate(2, new java.sql.Date(resq.getTo_date().getTime()));
			pstmt.setInt(3, resq.getNo_ofdays());
			pstmt.setInt(4, resq.getEmp_id());

			row = pstmt.executeUpdate();
			
		}  catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}
		return leave;

	}

	// leave update1

	public boolean updatestatus(String status, int requestId) {
		String insertQuery = "update leave_res set  status=? where request_id=?";
		Connection con=null;
		PreparedStatement pstmt =null;
		int row=0;
		try {
			con = ConnectionUtil.getConnection();
		    pstmt = con.prepareStatement(insertQuery);
			pstmt.setString(1, status);
			pstmt.setInt(2, requestId);

			row = pstmt.executeUpdate();
			
		}  catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}
		return true;

	}

	// delete
	public  void deletestatus(int requestId ) {
		
		String insertQuery = "delete from leave_res where request_id=?";
		Connection con=null;
		PreparedStatement pstmt =null;
		int row=0;
		try {
			con = ConnectionUtil.getConnection();
		  pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, requestId);
			row = pstmt.executeUpdate();
			

		}  catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}
		
	}

	public List<LeaveRes> showLevres() {
		List<LeaveRes> leaveRequest = new ArrayList<>();
		LeaveRes leave = null;
		String show = "select request_id,emp_id,reason,from_date,to_date,no_ofdays,status from LEAVE_RES";
		Connection con=null;
		ResultSet rs =null;
		PreparedStatement pstmt=null;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(show);
			 rs = pstmt.executeQuery(show);
			while (rs.next()) {
				
				leave = new LeaveRes(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5),
						rs.getInt(6), rs.getString(7));
				leaveRequest.add(leave);

			}
			return leaveRequest;

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(rs, pstmt, con);
		
	}
		return leaveRequest;
	}
	
	}


