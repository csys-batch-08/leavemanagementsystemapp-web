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
 * Servlet implementation class ShowLeaveBal1
 */
@WebServlet("/medilev")
public class ShowLeaveBal1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowLeaveBal1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int mel=Integer.parseInt(request.getParameter("medical"));
		int empid=Integer.parseInt(request.getParameter("id1"));
		ShowLevDaoImpl curt=new ShowLevDaoImpl();

		ShowLevBal s2=new ShowLevBal();
		s2.setEmp_id(empid)	;	
		int b=curt.mediLeave(s2);
		if(b>=mel)
		{
		
		
		ShowLevBal sbal1=new ShowLevBal(mel, empid, 0);
		ShowLevDaoImpl sdao1=new ShowLevDaoImpl();
		sdao1.updatebal1(sbal1);
		response.sendRedirect("showLeaveBalanceEmployee.jsp");
		}else
		{
			System.out.println("not availabl");
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
