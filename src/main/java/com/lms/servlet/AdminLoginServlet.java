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

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = 0;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (NumberFormatException n) {
			n.printStackTrace();
		}
		String password = request.getParameter("password");
		Admin ad = new Admin(id, password);
		AdminDaoImpl adi = new AdminDaoImpl();
		Admin adminDetails = adi.validateAdminlogin(ad);
		try {
			if (adminDetails != null) {

				response.sendRedirect("requestForm.jsp");

			} else {
				response.getWriter().println("invalid username or password");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
