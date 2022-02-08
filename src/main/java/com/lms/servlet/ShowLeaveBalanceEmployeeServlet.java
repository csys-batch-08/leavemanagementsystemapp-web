package com.lms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lms.daoimpl.ShowLevDaoImpl;
import com.lms.model.ShowLevBal;

@WebServlet("/employee")
public class ShowLeaveBalanceEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int empid = (int) session.getAttribute("empid");

		ShowLevBal show = new ShowLevBal(empid);
		ShowLevDaoImpl showlevbalance = new ShowLevDaoImpl();
		List<ShowLevBal> showbal = showlevbalance.checkBalance(show);
		request.setAttribute("showleave", showbal);
		RequestDispatcher leave = request.getRequestDispatcher("showLeaveBalanceEmployee.jsp");
		leave.forward(request, response);

	}

}
