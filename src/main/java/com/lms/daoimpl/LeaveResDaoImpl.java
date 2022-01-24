package com.lms.daoimpl;

import com.lms.*;
import com.lms.dao.LeaveResDao;
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

		String insertQuery = "insert into LEAVE_RES(emp_id,reason,from_date,to_date,no_ofdays) values(?,?,?,?,?)";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);

			pstmt.setInt(1, lev.getEmp_id());
			pstmt.setString(2, lev.getReason());
			pstmt.setDate(3, new java.sql.Date(lev.getFrom_date().getTime()));
			pstmt.setDate(4, new java.sql.Date(lev.getTo_date().getTime()));
			System.out.println(new java.sql.Date(lev.getFrom_date().getTime()));
			System.out.println(new java.sql.Date(lev.getTo_date().getTime()));
			pstmt.setInt(5, lev.getNo_ofdays());
			int i = pstmt.executeUpdate();
			System.out.println(i + "inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return leave;
	}

	// UPDATE:
	public LeaveRes updatelev(LeaveRes resq) {
		LeaveRes leave = new LeaveRes();
		String insertQuery = "update leave_res set  from_date=?,  to_date =? ,no_ofdays=? where emp_id=?";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setDate(1, new java.sql.Date(resq.getFrom_date().getTime()));
		

			pstmt.setDate(2, new java.sql.Date(resq.getTo_date().getTime()));
			pstmt.setInt(3, resq.getNo_ofdays());
			pstmt.setInt(4, resq.getEmp_id());

			int i = pstmt.executeUpdate();
			System.out.println(i + "updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return leave;

	}

	// leave update1

	public boolean updatestatus(String status, int request_id) {
		String insertQuery = "update leave_res set  status=? where request_id=?";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setString(1, status);
			pstmt.setInt(2, request_id);

			int i = pstmt.executeUpdate();
			System.out.println(i + " leave updated");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

	// delete
	public  void deletestatus(int request_id ) {
		
		String insertQuery = "delete from leave_res where request_id=?";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, request_id);
			int i = pstmt.executeUpdate();
			System.out.println(i + "deleted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<LeaveRes> showLevres() {
		List<LeaveRes> leaveRequest = new ArrayList<LeaveRes>();
		LeaveRes leave = null;
		String show = "select*from LEAVE_RES";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(show);
			while (rs.next()) {
				//System.out.format("%-10s%-10s%-10s%-13s%-15s%-5s%-4s\n", rs.getInt(1), rs.getInt(2), rs.getString(3),
					//	rs.getDate(4), rs.getDate(5), rs.getInt(6), rs.getString(7));
				leave = new LeaveRes(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5),
						rs.getInt(6), rs.getString(7));
				leaveRequest.add(leave);

			}
			return leaveRequest;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return leaveRequest;
	}
	
	}


