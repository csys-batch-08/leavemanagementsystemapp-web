package com.lms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.ShowLevDaoImpl;
import com.lms.model.ShowLevBal;

@WebServlet("/showadmin")
public class ShowLeaveBalanceAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShowLevDaoImpl showlevbalancead= new ShowLevDaoImpl();
		List<ShowLevBal> showbal=showlevbalancead.showbal() ;
		request.setAttribute("admin", showbal);
		RequestDispatcher balance =request.getRequestDispatcher("showLeaveBalanceAdmin.jsp");
		balance.forward(request, response);
	}

}
