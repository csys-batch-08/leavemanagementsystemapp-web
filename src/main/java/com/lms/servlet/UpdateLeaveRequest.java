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

@WebServlet("/update")
public class UpdateLeaveRequest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		int eid = Integer.parseInt(request.getParameter("id"));
		
		String datestr = request.getParameter("upfromdate");
		Date edt = null;
		try {
			
			edt = sdf.parse(datestr);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String datestr1 = request.getParameter("todate");
		Date edt1 = null;
		try {
			edt1 = sdf.parse(datestr1);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		int nof = Integer.parseInt(request.getParameter("nofdays"));
		LeaveRes levup = new LeaveRes(eid, edt, edt1, nof);
		LeaveResDaoImpl levupdao = new LeaveResDaoImpl();
		levupdao.updateLeave(levup);
		response.sendRedirect("applyLeave.jsp");
	}

}
