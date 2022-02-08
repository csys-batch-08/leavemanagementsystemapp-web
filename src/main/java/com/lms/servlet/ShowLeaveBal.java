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

@WebServlet("/caslev1")
public class ShowLeaveBal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowLeaveBal() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int csl = Integer.parseInt(request.getParameter("casual"));
		int empid = Integer.parseInt(request.getParameter("id"));
		ShowLevDaoImpl current = new ShowLevDaoImpl();

		ShowLevBal s1 = new ShowLevBal();
		s1.setEmpId(empid);
		int b = current.currentLeave(s1);
		if (b >= csl) {
			ShowLevBal sbal = new ShowLevBal(csl, empid);
			ShowLevDaoImpl sdao = new ShowLevDaoImpl();
			sdao.casualBalance(sbal);
			List<ShowLevBal> showbal = sdao.checkBalance(s1);
			request.setAttribute("showleave", showbal);
			RequestDispatcher leave = request.getRequestDispatcher("showLeaveBalanceEmployee.jsp");
			leave.forward(request, response);

		} 
	}



}
