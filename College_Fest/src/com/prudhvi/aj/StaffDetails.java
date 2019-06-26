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
@WebServlet("/rd")
public class StaffDetails extends HttpServlet {
	ServletContext sct=null;
	@Override
	public void init(ServletConfig config) {
		sct=config.getServletContext();
		
	}
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String sid=request.getParameter("firststaff").toUpperCase().toString();
		String name=request.getParameter("namefirst");
		String gender=request.getParameter("gender");
		Long mobno=Long.parseLong(request.getParameter("mobilenofirst"));
		String eventtype=request.getParameter("eventfirst");
		String orgid=request.getParameter("orgid1");
		String dept=request.getParameter("department");
		try {
			Connection con=ConnectionFactory.getMyConnection();
			PreparedStatement ps=con.prepareStatement("insert into fest_event_staff_create values(?,?,?,?,?,?,?)");
			ps.setString(1, sid);
			ps.setString(2,name);
			ps.setString(3, gender);
			ps.setLong(4,mobno);
			ps.setString(5,eventtype);
			ps.setString(6, orgid);
			ps.setString(7, dept);
			int count=ps.executeUpdate();
			System.out.println("records inserted:"+count);
			response.sendRedirect("College_Event_Staff_Create.jsp");
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		doPost(request,response);
	}
}
