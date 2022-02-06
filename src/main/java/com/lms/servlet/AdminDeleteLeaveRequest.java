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


@WebServlet("/dellev")
public class AdminDeleteLeaveRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int residel=Integer.parseInt(request.getParameter("resqsid"));
		System.out.println(residel);
		 LevStatus std=new  LevStatus(residel);
		 LeaveResDaoImpl levresd=new LeaveResDaoImpl ();
		 levresd.deletestatus(residel);
		 List<LeaveRes> showLevres=levresd.showLevres();
			request.setAttribute("request", showLevres);
			RequestDispatcher res=request.getRequestDispatcher("showLeaveRes.jsp") ;
			res.forward(request, response);
	}

	

}
