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

import com.lms.daoimpl.LeaveResDaoImpl;
import com.lms.model.LeaveRes;

@WebServlet("/leaverequest")
public class ShowLeaveRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowLeaveRequestServlet() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LeaveResDaoImpl levres = new LeaveResDaoImpl();
		List<LeaveRes> showLevres = levres.showLevres();
		request.setAttribute("request", showLevres);
		RequestDispatcher res = request.getRequestDispatcher("showLeaveRes.jsp");
		res.forward(request, response);
	}

}
