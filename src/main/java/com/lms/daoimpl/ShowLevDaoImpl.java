package com.lms.daoimpl;

import com.lms.dao.ShowLevDao;
import com.lms.logger.Logger;
import com.lms.model.*;
import com.lms.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ShowLevDaoImpl implements ShowLevDao {

	public ShowLevBal insertleave(ShowLevBal sb) {
		ShowLevBal balance = new ShowLevBal();

		int CAUSAL_LEV_BAL = 10;
		int MEDI_LEV_BAL = 10;
		int PAID_LEV = 0;
		PreparedStatement pstmt=null;
		int row=0;
		String insertQuery = "insert into leave_bal(emp_id,CAUSAL_LEV_BAL,MEDI_LEV_BAL,PAID_LEV) values(?,?,?,?)";
		Connection con=null;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, sb.getEmp_id());
			pstmt.setInt(2, sb.getCausal_lev_bal());
			pstmt.setInt(3, sb.getMedi_lev_bal());
			pstmt.setInt(4, sb.getPaid_lev());
			row = pstmt.executeUpdate();
			
		}  catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}
		return balance;
	}
	// update

	public ShowLevBal updatebal(ShowLevBal shw) {
		ShowLevBal balance = new ShowLevBal();
		int row=0;
		PreparedStatement pstmt = null;
        String query = "update leave_bal set causal_lev_bal=causal_lev_bal - ? where emp_id=?";
		Connection con=null;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(query);
			 pstmt.setInt(1, shw.getCausal_lev());
			 pstmt.setInt(2, shw.getEmp_id());
			row = pstmt.executeUpdate();
			

		}  catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}
		return balance;
	}

	public ShowLevBal updatebal1(ShowLevBal shw1) {
		ShowLevBal balance = new ShowLevBal();
		PreparedStatement pstmt = null;
		Connection con=null;
		int row=0;
		String query = "update leave_bal set medi_lev_bal=medi_lev_bal - ? where emp_id=?";
		
		try {
			con = ConnectionUtil.getConnection();
			 pstmt= con.prepareStatement(query);
			 pstmt.setInt(1, shw1.getMedical_lev());
			 pstmt.setInt(2, shw1.getEmp_id());
			row =  pstmt.executeUpdate();
			

		}  catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}
		return balance;

	}

	public ShowLevBal updatebal2(ShowLevBal shw2) {
		ShowLevBal balance = new ShowLevBal();

	
		PreparedStatement pstmt = null;
		Connection con=null;
		int row=0;
		String query = "update leave_bal set paid_lev=paid_lev + ? where emp_id=?";
		
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, shw2.getPaid_lev());
			pstmt.setInt(2, shw2.getEmp_id());
			row =pstmt .executeUpdate();
			

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);
		
	}
		return balance;
	}

	public List<ShowLevBal> showbal() {
		List<ShowLevBal> showlev=new ArrayList<>();
		ShowLevBal showlevba=null;
		String query1 = "select emp_id,causal_lev,medical_lev,causal_lev_bal,medi_lev_bal,paid_lev from LEAVE_BAL ";
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(query1);
			 rs = pstmt.executeQuery(query1);
		while (rs.next()) {

			showlevba=new ShowLevBal(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
			showlev.add(showlevba);
				
		}
		}
		catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		}
		
		finally {

			ConnectionUtil.close(rs, pstmt, con);
		
	}
		return showlev;
	}
	
	
	public List<ShowLevBal> checkbalance(ShowLevBal sh) {
		List<ShowLevBal> clev=new ArrayList<>();
		ShowLevBal clevba=null;
       PreparedStatement pstmt=null;   
		String query1 = "select * from LEAVE_BAL WHERE EMP_ID= "+sh.getEmp_id();
		Connection con=null;
		ResultSet rs =null;
		try {
			con = ConnectionUtil.getConnection();
			 pstmt = con.prepareStatement(query1);
			 rs = pstmt.executeQuery(query1);
		while (rs.next()) {

			clevba=new ShowLevBal(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
			clev.add(clevba);
				
		}
		
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		}
		
		finally {

			ConnectionUtil.close(rs, pstmt, con);
		
	}
		return clev ;
	}
	
	public int currentLeave(ShowLevBal s1) {
		 
		int availablealeave=0;
		String query1="select causal_lev_bal from leave_bal where emp_id=?";
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		 Connection con=null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(query1);
			pstmt.setInt(1, s1.getEmp_id());
			 rs=pstmt.executeQuery();
			while (rs.next()) {
				availablealeave=rs.getInt(1);
			}
		}catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(rs, pstmt, con);
		
	}
		
		return availablealeave;} 
		
	
	public int mediLeave(ShowLevBal s2) {
		 
		int leave=0;
		String query1="select medi_lev_bal from leave_bal where emp_id=?";
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		 Connection con=null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(query1);
			pstmt.setInt(1, s2.getEmp_id());
			 rs=pstmt.executeQuery();
			while (rs.next()) {
				leave=rs.getInt(1);
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(rs, pstmt, con);
		
	}
		
		return leave;} 
		
	
	}

	

