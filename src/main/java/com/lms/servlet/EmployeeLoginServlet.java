package com.lms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lms.daoimpl.EmpDaoImpl;
import com.lms.model.EmpLogin;

/**
 * Servlet implementation class EmployeeLoginServlet
 */
@WebServlet("/EmployeeLogin")
public class EmployeeLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =response.getWriter();
		HttpSession session=request.getSession();
		
		 String name=request.getParameter("empname");
		String password=request.getParameter("password");
		EmpLogin emplog=new EmpLogin(name,password);
		EmpDaoImpl empdao=new EmpDaoImpl();
		ResultSet rs =empdao.validateLogin(emplog);
	
		try {
			if(rs.next()) {
			
			int empid=rs.getInt(1);
			System.out.println(empid);
			session.setAttribute("empid", empid);
			
				response.sendRedirect("applyLeave.jsp");
			}else {
				

					out.println("<script type=\"text/javascript\">");
					out.println("alert('Invalid username  or password');");
					out.println("location='employeeLogin.jsp';");
					out.println("</script>");

				

			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

	
}
