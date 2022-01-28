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
 * Servlet implementation class ShowLeaveBal
 */
@WebServlet("/caslev1")
public class ShowLeaveBal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowLeaveBal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		int csl=Integer.parseInt(request.getParameter("casual"));
		int empid=Integer.parseInt(request.getParameter("id"));
		ShowLevDaoImpl current=new ShowLevDaoImpl();

		ShowLevBal s1=new ShowLevBal();
		s1.setEmp_id(empid)	;	
		int b=current.currentLeave(s1);
		if(b>=csl)
		{
		ShowLevBal sbal=new ShowLevBal(csl, empid);
		ShowLevDaoImpl sdao=new ShowLevDaoImpl();
		sdao.updatebal(sbal);
		response.sendRedirect("showLeaveBalanceEmployee.jsp");
		}
		else
		{
			System.out.println("not available");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
