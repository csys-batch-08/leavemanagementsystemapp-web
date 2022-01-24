package com.lms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.AdminDaoImpl;
import com.lms.model.EmpLogin;

/**
 * Servlet implementation class AdminUpdateEmployee
 */
@WebServlet("/updateemp")
public class AdminUpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("updated");
		String dept=request.getParameter("depart");
		int empupdateid=Integer.parseInt(request.getParameter("empupid"));
	
		EmpLogin empupin=new EmpLogin( dept,empupdateid);
		AdminDaoImpl amupdao=new AdminDaoImpl();
		amupdao.updateuser(empupin);
		 response.sendRedirect("ShowAllEmployee.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
