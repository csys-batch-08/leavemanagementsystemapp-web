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
 * Servlet implementation class TypeOfLeaveInsert
 */
@WebServlet("/typeinsert")

public class TypeOfLeaveInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeOfLeaveInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int emid=Integer.parseInt(request.getParameter("emplid"));
		int clev=Integer.parseInt(request.getParameter("caslev"));
		int mlev=Integer.parseInt(request.getParameter("medlev"));
		int plev=Integer.parseInt(request.getParameter("lev"));
		ShowLevBal slb=new ShowLevBal(emid, clev, mlev, plev);
		ShowLevDaoImpl slbdao=new ShowLevDaoImpl();
		slbdao.insertleave(slb);
		slbdao.updatebal(slb);
		slbdao.updatebal1(slb);
		slbdao.updatebal2(slb);
		response.sendRedirect("BalanceOfleave.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
