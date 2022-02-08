package com.lms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.LeaveResDaoImpl;
import com.lms.model.LeaveRes;
import com.lms.model.LevStatus;

@WebServlet("/adulev")
public class AdminUpdateLeaveRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminUpdateLeaveRequest() {
		super();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String status = request.getParameter("status");
		int resid = Integer.parseInt(request.getParameter("resid"));
		LevStatus st = new LevStatus(status, resid);
		LeaveResDaoImpl levre = new LeaveResDaoImpl();
		levre.updateStatus(status, resid);

		List<LeaveRes> showLevres = levre.showLevres();
		request.setAttribute("request", showLevres);
		RequestDispatcher res = request.getRequestDispatcher("showLeaveRes.jsp");
		res.forward(request, response);

	}

}
