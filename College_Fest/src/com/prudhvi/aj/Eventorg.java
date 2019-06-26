package com.prudhvi.aj;

import java.io.IOException;
import java.io.Serializable;
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
@WebServlet("/st")
public class Eventorg extends HttpServlet  {

	ServletContext sct=null;
	@Override
	public void init(ServletConfig config) {
		sct=config.getServletContext();
	}
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String sid=request.getParameter("id");
		String  name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		String gdr=request.getParameter("gender");
		String mob=request.getParameter("mobileno");
		System.out.println("String:"+mob);
		Long mobile=Long.parseLong(mob);
		System.out.println("Long:"+mobile);
		String dept=request.getParameter("dept");
		String event=request.getParameter("event");
		try {
			Connection con=ConnectionFactory.getMyConnection();
			PreparedStatement ps=con.prepareStatement("insert into fest_event_org_create values(?,?,?,?,?,?,? )");
			ps.setString(1, sid);
			ps.setString(2, name);
			ps.setString(3, pwd);
			ps.setString(4, gdr);
			ps.setLong(5, mobile);
			ps.setString(6, dept);
			ps.setString(7, event);
			int count=ps.executeUpdate();
			System.out.println("records inserted:"+count);
			request.setAttribute("count", count);
			response.sendRedirect("collegeeventorgaccount.jsp");
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
@Override
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		doPost(request,response);
}

}
