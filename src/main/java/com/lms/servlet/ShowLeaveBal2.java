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

@WebServlet("/paidlev")
public class ShowLeaveBal2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowLeaveBal2() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int paid = Integer.parseInt(request.getParameter("paid"));
		int empid = Integer.parseInt(request.getParameter("id2"));
		ShowLevBal sbal2 = new ShowLevBal(empid, 0, 0, paid);
		ShowLevDaoImpl sdao2 = new ShowLevDaoImpl();
		sdao2.paidLeave(sbal2);
		List<ShowLevBal> showbal = sdao2.checkBalance(sbal2);
		request.setAttribute("showleave", showbal);
		RequestDispatcher leave = request.getRequestDispatcher("showLeaveBalanceEmployee.jsp");
		leave.forward(request, response);

	}

	

}
