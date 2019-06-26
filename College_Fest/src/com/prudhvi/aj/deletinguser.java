package com.prudhvi.aj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/del")
public class deletinguser extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
		String user=request.getParameter("user");
		System.out.println(user);
		try {
			Connection con=ConnectionFactory.getMyConnection();
			PreparedStatement ps=con.prepareStatement("delete from fest_event_org_create where id=?");
			ps.setString(1, user);
			int count=ps.executeUpdate();
			System.out.println("records deleted:"+count);
			response.sendRedirect("College_Event_org.jsp");
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IOException
				| SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
		this.doPost(request,response);
	}
}
