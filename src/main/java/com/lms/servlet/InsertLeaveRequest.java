package com.lms.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.LeaveResDaoImpl;
import com.lms.model.LeaveRes;

@WebServlet("/insert")
public class InsertLeaveRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InsertLeaveRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		int empid = Integer.parseInt(request.getParameter("id"));
		String reason = request.getParameter("reason");
		String datestr = request.getParameter("fromdate");
		Date dt = null;
		try {
			dt = sdf.parse(datestr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String datestr1 = request.getParameter("todate");
		Date dt1 = null;
		try {
			dt1 = sdf.parse(datestr1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int no = Integer.parseInt(request.getParameter("days"));
		LeaveRes lev = new LeaveRes(empid, reason, dt, dt1, no);
		LeaveResDaoImpl levda = new LeaveResDaoImpl();
		levda.applyLeave(lev);

		response.sendRedirect("applyLeave.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
