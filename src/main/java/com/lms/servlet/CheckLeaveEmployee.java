package com.lms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.EmpDaoImpl;
import com.lms.daoimpl.ShowLevDaoImpl;
import com.lms.model.EmpLogin;
import com.lms.model.ShowLevBal;


@WebServlet("/checklevbal")
public class CheckLeaveEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CheckLeaveEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empId=Integer.parseInt (request.getParameter("emp_id"));
		ShowLevBal sh=new ShowLevBal();
		ShowLevDaoImpl cklev=new ShowLevDaoImpl() ;
		List<ShowLevBal> checkbal=cklev.checkbalance(sh);
		cklev.checkbalance(sh);
		response.sendRedirect("checkLeaveEmployee.jsp");
		request.setAttribute("check", checkbal);
		RequestDispatcher balance =request.getRequestDispatcher("checkLeaveEmployee.jsp");
		balance.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
