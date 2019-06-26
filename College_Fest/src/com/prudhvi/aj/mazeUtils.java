package com.prudhvi.aj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/msb")
public class mazeUtils extends HttpServlet {
	ServletContext sct=null;
	PrintWriter out=null;
		@Override
		public void init(ServletConfig config) {
			sct=config.getServletContext();
		}
		@Override
		public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
			try {
				Connection con=ConnectionFactory.getMyConnection();
				String id=(request.getParameter("name")).toUpperCase().toString();
				
				
				String passwrd=request.getParameter("pwd");
				out=response.getWriter();
				Statement st=con.createStatement();
				
				PreparedStatement ps=con.prepareStatement("select * from fest_event_org_create where id=?");
				ps.setString(1,id);
				ResultSet rs=ps.executeQuery();
				PreparedStatement ps1=con.prepareStatement("select sid from fest_Event_staff_Create where orgid=?");
				ps1.setString(1, id);
				ResultSet rs1=ps1.executeQuery();
				int count=0;
				while(rs1.next()) {
					System.out.println(rs1.getString("sid"));
					count++;
				}
				sct.setAttribute("count", count);
				System.out.println(count);
				while(rs.next()) {
					System.out.println(rs.getString(1)+"--------"+rs.getString(2)+"--------"+rs.getString(3)+"--------"+rs.getString(4)+"-------"+rs.getLong(5)+"--------"+rs.getString(6)+"-------"+rs.getString(7));
				if(id.equals(rs.getString(1))) {
					if(passwrd.equalsIgnoreCase(rs.getString(3))) {
						HttpSession hs=request.getSession();
						hs.setAttribute("orgid", rs.getString(1));
						sct.setAttribute("stname",rs.getString(2));
						sct.setAttribute("passwrd",rs.getString(3) );
						sct.setAttribute("gender", rs.getString(4));
						sct.setAttribute("mobileno", rs.getLong(5));
						sct.setAttribute("dept", rs.getString(6));
						sct.setAttribute("event", rs.getString(7));
						response.sendRedirect("College_Event_Org_Home.jsp");
						
					}
					else {
						out.println("<h1>password missmatch</h1>");
					}
				
				}
				else {
					out.println("<h1>user does'nt exist</h1>");
				}
				}
				
				
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
