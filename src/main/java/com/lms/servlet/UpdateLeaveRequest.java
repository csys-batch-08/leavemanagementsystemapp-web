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

/**
 * Servlet implementation class UpdateLeaveRequest
 */
@WebServlet("/update")
public class UpdateLeaveRequest extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		int eid=Integer.parseInt(request.getParameter("id"));
		System.out.println(eid);
		String datestr=request.getParameter("upfromdate");
		Date edt = null;
		try {
			System.out.println("pothi");
			edt = sdf.parse(datestr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String datestr1=request.getParameter("todate");
		Date edt1 = null;
		try {
			edt1 = sdf.parse(datestr1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		int nof=Integer.parseInt(request.getParameter("nofdays"));
		LeaveRes levup=new LeaveRes(eid, edt, edt1, nof);
		LeaveResDaoImpl levupdao=new LeaveResDaoImpl();
		System.out.println(levup);
		System.out.println();
		levupdao.updatelev(levup);
		response.sendRedirect("ApplyLeave.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
