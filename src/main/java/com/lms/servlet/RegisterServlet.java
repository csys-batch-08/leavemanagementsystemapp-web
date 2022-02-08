package com.lms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lms.daoimpl.EmpDaoImpl;
import com.lms.model.EmpLogin;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		String name = request.getParameter("fn");
		String department = request.getParameter("department");
		System.out.println(department);
		String email = request.getParameter("gmail");
		String password = request.getParameter("password");
		EmpLogin el = new EmpLogin(name, department, email, password);
		EmpDaoImpl edl = new EmpDaoImpl();
		int i = edl.resister(el);
		System.out.println(i);
		if (i > 0) {

			out.println("<script type=\"text/javascript\">");
			out.println("alert('Resister successfully');");
			out.println("location='employeeLogin.jsp';");
			out.println("</script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
