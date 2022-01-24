package com.lms.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lms.model.DeleteEmployee;
import com.lms.model.EmpLogin;
import com.lms.util.ConnectionUtil;

public class DeleteEmployeeDaoImpl {
	

	public DeleteEmployee insert(DeleteEmployee log) {

		DeleteEmployee login = new DeleteEmployee();
		String insertQuery = "insert into LMS_EMPLOYEE_REC(emp_id,emp_name,emp_department,emp_email) values(?,?,?,?)";

		Connection con;
		try {
			con = ConnectionUtil.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setInt(1, log.getEmp_id());
			pstmt.setString(2, log.getEmp_name());
			pstmt.setString(3, log.getEmp_department());
			pstmt.setString(4, log.getEmp_email());
			
			int i = pstmt.executeUpdate();
			System.out.println(i + "inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return login;
	}

}
