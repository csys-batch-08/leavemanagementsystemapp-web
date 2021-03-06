package com.lms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.EmpDaoImpl;
import com.lms.model.EmpLogin;

@WebServlet("/addlev")
public class ShowLeaveUpdate3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowLeaveUpdate3() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int empid = Integer.parseInt(request.getParameter("id"));
		EmpLogin el = new EmpLogin(empid);
		EmpDaoImpl edi = new EmpDaoImpl();
		edi.addLeave(el);
		response.sendRedirect("employee");
	}

}
