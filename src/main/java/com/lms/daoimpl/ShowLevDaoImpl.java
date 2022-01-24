package com.lms.daoimpl;

import com.lms.dao.ShowLevDao;
import com.lms.model.*;
import com.lms.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShowLevDaoImpl implements ShowLevDao {

	public ShowLevBal insertleave(ShowLevBal sb) {
		ShowLevBal balance = new ShowLevBal();

		int CAUSAL_LEV_BAL = 10;
		int MEDI_LEV_BAL = 10;
		int PAID_LEV = 0;

		String insertQuery = "insert into leave_bal(emp_id,CAUSAL_LEV_BAL,MEDI_LEV_BAL,PAID_LEV) values(?,?,?,?)";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, sb.getEmp_id());
			pstmt.setInt(2, sb.getCausal_lev_bal());
			pstmt.setInt(3, sb.getMedi_lev_bal());
			pstmt.setInt(4, sb.getPaid_lev());
			int i = pstmt.executeUpdate();
			System.out.println("leave inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}
	// update

	public ShowLevBal updatebal(ShowLevBal shw) {
		ShowLevBal balance = new ShowLevBal();

		// String query = "update leave_bal set causal_lev_bal=(SELECT causal_lev_bal
		// from leave_bal where emp_id=? )+ where emp_id=?";
		
		String query = "update leave_bal set causal_lev_bal=causal_lev_bal - ? where emp_id=?";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pre = con.prepareStatement(query);
			pre.setInt(1, shw.getCausal_lev());
			pre.setInt(2, shw.getEmp_id());
			int i = pre.executeUpdate();
			System.out.println(i + "inserted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}

	public ShowLevBal updatebal1(ShowLevBal shw1) {
		ShowLevBal balance = new ShowLevBal();

		// String query = "update leave_bal set causal_lev_bal=(SELECT causal_lev_bal
		// from leave_bal where emp_id=? )+ where emp_id=?";
		String query = "update leave_bal set medi_lev_bal=medi_lev_bal - ? where emp_id=?";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pre = con.prepareStatement(query);
			pre.setInt(1, shw1.getMedical_lev());
			pre.setInt(2, shw1.getEmp_id());
			int i = pre.executeUpdate();
			System.out.println(i + "inserted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;

	}

	public ShowLevBal updatebal2(ShowLevBal shw2) {
		ShowLevBal balance = new ShowLevBal();

		// String query = "update leave_bal set causal_lev_bal=(SELECT causal_lev_bal
		// from leave_bal where emp_id=? )+ where emp_id=?";
		String query = "update leave_bal set paid_lev=paid_lev + ? where emp_id=?";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pre = con.prepareStatement(query);
			pre.setInt(1, shw2.getPaid_lev());
			pre.setInt(2, shw2.getEmp_id());
			int i = pre.executeUpdate();
			System.out.println(i + "inserted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}

	public List<ShowLevBal> showbal() {
		List<ShowLevBal> showlev=new ArrayList<ShowLevBal>();
		ShowLevBal showlevba=null;

		String query1 = "select * from LEAVE_BAL ";
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			Statement pstmt = con.createStatement();
			ResultSet rs = pstmt.executeQuery(query1);
		while (rs.next()) {
//				System.out.format("%-10s%-10s%-10s%-10s%-10s%-10s\n", rs.getInt(1), rs.getInt(2), rs.getInt(3),
//						rs.getInt(4), rs.getInt(5), rs.getInt(6));
			showlevba=new ShowLevBal(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
			showlev.add(showlevba);
				
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return showlev;
	}
	
	
	public List<ShowLevBal> checkbalance(ShowLevBal sh) {
		List<ShowLevBal> clev=new ArrayList<ShowLevBal>();
		ShowLevBal clevba=null;

		String query1 = "select * from LEAVE_BAL WHERE EMP_ID= "+sh.getEmp_id();
		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			Statement pstmt = con.createStatement();
			ResultSet rs = pstmt.executeQuery(query1);
		while (rs.next()) {

			clevba=new ShowLevBal(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
			clev.add(clevba);
				
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clev ;
	}
	
	public int currentLeave(ShowLevBal s1) {
		 
		int availablealeave=0;
		String query1="select causal_lev_bal from leave_bal where emp_id=?";
	
		 Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pre = con.prepareStatement(query1);
			pre.setInt(1, s1.getEmp_id());
			ResultSet rs=pre.executeQuery();
			while (rs.next()) {
				availablealeave=rs.getInt(1);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return availablealeave;} 
		
	
	public int mediLeave(ShowLevBal s2) {
		 
		int leave=0;
		String query1="select medi_lev_bal from leave_bal where emp_id=?";
	
		 Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pre = con.prepareStatement(query1);
			pre.setInt(1, s2.getEmp_id());
			ResultSet rs=pre.executeQuery();
			while (rs.next()) {
				leave=rs.getInt(1);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return leave;} 
		
	
	}

	

