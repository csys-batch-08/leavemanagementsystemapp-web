package com.lms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.AdminDaoImpl;
import com.lms.model.EmpLogin;

@WebServlet("/updateemp")
public class AdminUpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminUpdateEmployee() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String dept = request.getParameter("depart");
		int empupdateid = Integer.parseInt(request.getParameter("empupid"));

		EmpLogin empupin = new EmpLogin(dept, empupdateid);
		AdminDaoImpl amupdao = new AdminDaoImpl();
		amupdao.updateUser(empupin);
		List<EmpLogin> log = amupdao.showEmployee();
		request.setAttribute("employee", log);
		RequestDispatcher show = request.getRequestDispatcher("showAllEmployee.jsp");
		show.forward(request, response);

	}

	

}
