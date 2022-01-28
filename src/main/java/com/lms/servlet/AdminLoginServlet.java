package com.lms.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.AdminDaoImpl;
import com.lms.model.Admin;


@WebServlet("/AdminLogin1")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id= Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		Admin ad=new Admin(id, password);
		AdminDaoImpl adi=new AdminDaoImpl(); 
		ResultSet rs= adi.validateAdminlogin(ad);
		try {
			if(rs.next()) {
				if(rs.getInt(1) == id && rs.getString(2).equals(password)) {
					response.sendRedirect("requestForm.jsp");
				}
			}else {
				response.getWriter().println("invalid username or password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}


}
