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

import com.lms.daoimpl.EmpDaoImpl;
import com.lms.daoimpl.ShowLevDaoImpl;
import com.lms.model.EmpLogin;
@WebServlet("/employeeprofile")
public class UserProfileServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("hi");
		HttpSession session=req.getSession();
		int empid=(int)session.getAttribute("empid");
		EmpDaoImpl userprofile= new EmpDaoImpl();
		List<EmpLogin> userDetails=userprofile.userview(empid);
		session.setAttribute("userDetail", userDetails);
        RequestDispatcher rd= req.getRequestDispatcher("UserView.jsp");
		
		rd.forward(req, resp);
	}

}
