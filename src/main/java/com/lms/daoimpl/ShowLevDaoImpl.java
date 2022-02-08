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

	public ShowLevBal insertLeave(ShowLevBal sb) {
		ShowLevBal balance = new ShowLevBal();

		int CAUSAL_LEV_BAL = 10;
		int MEDI_LEV_BAL = 10;
		int PAID_LEV = 0;
		PreparedStatement pstmt = null;

		String insertQuery = "insert into leave_bal(emp_id,CAUSAL_LEV_BAL,MEDI_LEV_BAL,PAID_LEV) values(?,?,?,?)";
		Connection con = null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, sb.getEmpId());
			pstmt.setInt(2, sb.getCasualBalance());
			pstmt.setInt(3, sb.getMedicalBalance());
			pstmt.setInt(4, sb.getPaidLeave());
			pstmt.executeUpdate();

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);

		}
		return balance;
	}
	// update

	public ShowLevBal casualBalance(ShowLevBal shw) {
		ShowLevBal balance = new ShowLevBal();

		PreparedStatement pstmt = null;
		String query = "update leave_bal set causal_lev_bal=causal_lev_bal - ? where emp_id=?";
		Connection con = null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, shw.getCasualLeave());
			pstmt.setInt(2, shw.getEmpId());
			pstmt.executeUpdate();

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);

		}
		return balance;
	}

	public ShowLevBal medicalBalance(ShowLevBal shw1) {
		ShowLevBal balance = new ShowLevBal();
		PreparedStatement pstmt = null;
		Connection con = null;

		String query = "update leave_bal set medi_lev_bal=medi_lev_bal - ? where emp_id=?";

		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, shw1.getMedicalLeave());
			pstmt.setInt(2, shw1.getEmpId());
			pstmt.executeUpdate();

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);

		}
		return balance;

	}

	public ShowLevBal paidLeave(ShowLevBal shw2) {
		ShowLevBal balance = new ShowLevBal();

		PreparedStatement pstmt = null;
		Connection con = null;

		String query = "update leave_bal set paid_lev=paid_lev + ? where emp_id=?";

		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, shw2.getPaidLeave());
			pstmt.setInt(2, shw2.getEmpId());
			pstmt.executeUpdate();

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(null, pstmt, con);

		}
		return balance;
	}

	public List<ShowLevBal> showbal() {
		List<ShowLevBal> showlev = new ArrayList<>();
		ShowLevBal showlevba = null;
		String query1 = "select emp_id,causal_lev,medical_lev,causal_lev_bal,medi_lev_bal,paid_lev from LEAVE_BAL ";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(query1);
			rs = pstmt.executeQuery(query1);
			while (rs.next()) {

				showlevba = new ShowLevBal(rs.getInt("emp_id"), rs.getInt("causal_lev"), rs.getInt("medical_lev"), rs.getInt("causal_lev_bal"), rs.getInt("medi_lev_bal"),
						rs.getInt("paid_lev"));
				showlev.add(showlevba);

			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		}

		finally {

			ConnectionUtil.close(rs, pstmt, con);

		}
		return showlev;
	}

	public List<ShowLevBal> checkBalance(ShowLevBal sh) {
		List<ShowLevBal> clev = new ArrayList<>();
		ShowLevBal clevba = null;
		PreparedStatement pstmt = null;
		String query1 = "select emp_id,causal_lev,medical_lev,causal_lev_bal,medi_lev_bal,paid_lev from LEAVE_BAL WHERE EMP_ID= " + sh.getEmpId();
		Connection con = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(query1);
			rs = pstmt.executeQuery(query1);
			while (rs.next()) {

				clevba = new ShowLevBal(rs.getInt("emp_id"), rs.getInt("causal_lev"), rs.getInt("medical_lev"), rs.getInt("causal_lev_bal"), rs.getInt("medi_lev_bal"),
						rs.getInt("paid_lev"));
				clev.add(clevba);

			}

		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		}

		finally {

			ConnectionUtil.close(rs, pstmt, con);

		}
		return clev;
	}

	public int currentLeave(ShowLevBal s1) {

		int availablealeave = 0;
		String query1 = "select causal_lev_bal from leave_bal where emp_id=?";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(query1);
			pstmt.setInt(1, s1.getEmpId());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				availablealeave = rs.getInt(1);
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(rs, pstmt, con);

		}

		return availablealeave;
	}

	public int mediLeave(ShowLevBal s2) {

		int leave = 0;
		String query1 = "select medi_lev_bal from leave_bal where emp_id=?";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = ConnectionUtil.getConnection();
			pstmt = con.prepareStatement(query1);
			pstmt.setInt(1, s2.getEmpId());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				leave = rs.getInt(1);
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionUtil.close(rs, pstmt, con);

		}

		return leave;
	}

}
