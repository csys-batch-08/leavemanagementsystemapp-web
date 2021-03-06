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

@WebServlet("/medilev")
public class ShowLeaveBal1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowLeaveBal1() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int mel = Integer.parseInt(request.getParameter("medical"));
		int empid = Integer.parseInt(request.getParameter("id1"));
		ShowLevDaoImpl curt = new ShowLevDaoImpl();

		ShowLevBal s2 = new ShowLevBal();
		s2.setEmpId(empid);
		int b = curt.mediLeave(s2);
		if (b >= mel) {

			ShowLevBal sbal1 = new ShowLevBal(mel, empid, 0);
			ShowLevDaoImpl sdao1 = new ShowLevDaoImpl();
			sdao1.medicalBalance(sbal1);
			List<ShowLevBal> showbal = sdao1.checkBalance(s2);
			request.setAttribute("showleave", showbal);
			RequestDispatcher leave = request.getRequestDispatcher("showLeaveBalanceEmployee.jsp");
			leave.forward(request, response);

		} 
			
		}

	}

	
	


