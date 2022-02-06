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

@WebServlet("/showemployee")
public class showAllEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		AdminDaoImpl employ=new AdminDaoImpl ();
		List<EmpLogin> log=employ.showEmployee();
		request.setAttribute("employee", log);
		RequestDispatcher show=request.getRequestDispatcher("showAllEmployee.jsp");
		show.forward(request, response);
		
	}

}
