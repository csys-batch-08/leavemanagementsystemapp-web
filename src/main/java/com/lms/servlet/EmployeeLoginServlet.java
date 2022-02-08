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

@WebServlet("/EmployeeLogin")
public class EmployeeLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeLoginServlet() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String name = request.getParameter("empname");
		String password = request.getParameter("password");
		EmpLogin emplog = new EmpLogin(name, password);
		EmpDaoImpl empdao = new EmpDaoImpl();
		EmpLogin log = empdao.validateLogin(emplog);

		try {
			PrintWriter out = response.getWriter();
			if (log != null) {

				int empid = log.getEmpId();
				
				session.setAttribute("empid", empid);

				response.sendRedirect("applyLeave.jsp");
			} else {

				out.println("<script type=\"text/javascript\">");
				out.println("alert('Invalid username  or password');");
				out.println("location='employeeLogin.jsp';");
				out.println("</script>");

			}

		} catch (IOException e1) {

			e1.printStackTrace();
		}

	}

}
