package com.lms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.AdminDaoImpl;
import com.lms.daoimpl.DeleteEmployeeDaoImpl;
import com.lms.model.DeleteEmployee;
import com.lms.model.EmpLogin;

/**
 * Servlet implementation class AdminDeleteEmployee
 */
@WebServlet("/empdelete")
public class AdminDeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int empdeleteid=Integer.parseInt(request.getParameter("empdelid"));
		EmpLogin empdelin=new EmpLogin(empdeleteid);
		AdminDaoImpl amdeldao=new AdminDaoImpl();
		amdeldao.deleteuser(empdelin);
		
		DeleteEmployee del=new DeleteEmployee(empdeleteid, getServletInfo(), getServletName(), getServletInfo());
		DeleteEmployeeDaoImpl deldao=new DeleteEmployeeDaoImpl();
		deldao.insert(del);
		
		 response.sendRedirect("RequestForm.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
