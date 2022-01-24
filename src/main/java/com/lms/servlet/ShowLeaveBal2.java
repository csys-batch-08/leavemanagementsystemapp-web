package com.lms.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lms.daoimpl.ShowLevDaoImpl;
import com.lms.model.ShowLevBal;

/**
 * Servlet implementation class ShowLeaveBal2
 */
@WebServlet("/paidlev")
public class ShowLeaveBal2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowLeaveBal2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int paid=Integer.parseInt(request.getParameter("paid"));
		int empid=Integer.parseInt(request.getParameter("id2"));
		ShowLevBal sbal2=new ShowLevBal(empid, 0, 0, paid);
		ShowLevDaoImpl sdao2=new ShowLevDaoImpl();
		sdao2.updatebal2(sbal2);
		response.sendRedirect("ShowLeaveBalanceEmployee.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
