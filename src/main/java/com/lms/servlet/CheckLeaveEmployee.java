package com.lms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.EmpDaoImpl;
import com.lms.daoimpl.ShowLevDaoImpl;
import com.lms.model.EmpLogin;
import com.lms.model.ShowLevBal;

/**
 * Servlet implementation class CheckLeaveEmployee
 */
@WebServlet("/checklevbal")
public class CheckLeaveEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLeaveEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int employeeid=Integer.parseInt(request.getParameter("cid"));
		ShowLevBal sh=new ShowLevBal(employeeid);
		ShowLevDaoImpl cklev=new ShowLevDaoImpl() ;
		cklev.checkbalance(sh);
		response.sendRedirect("CheckLeaveEmployee.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
