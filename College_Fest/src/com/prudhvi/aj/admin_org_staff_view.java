package com.prudhvi.aj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ty")
public class admin_org_staff_view extends HttpServlet {
	ServletContext sct=null;
	@Override
	public void init(ServletConfig config) {
		sct=config.getServletContext();
	}
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String orgstaffshow=request.getParameter("orgstaff");
		
		sct.setAttribute("orgstaff", orgstaffshow);
		response.sendRedirect("CollegeEventOrgStaff.jsp");
		
	}
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		doPost(request,response);
	}
	
}
