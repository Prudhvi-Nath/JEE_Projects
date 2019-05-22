package com.prudhvi.aj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/stfeed")
public class stfeedback extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String stid=request.getParameter("stuid");
		int cp1=Integer.parseInt(request.getParameter("cp1"));
		int cp2=Integer.parseInt(request.getParameter("cp2"));
		int cp3=Integer.parseInt(request.getParameter("cp3"));
		int cp4=Integer.parseInt(request.getParameter("cp4"));
		int cp5=Integer.parseInt(request.getParameter("cp5"));
		
		int java1=Integer.parseInt(request.getParameter("java1"));
		int java2=Integer.parseInt(request.getParameter("java2"));
		int java3=Integer.parseInt(request.getParameter("java3"));
		int java4=Integer.parseInt(request.getParameter("java4"));
		int java5=Integer.parseInt(request.getParameter("java5"));
		
		int ds1=Integer.parseInt(request.getParameter("ds1"));
		int ds2=Integer.parseInt(request.getParameter("ds2"));
		int ds3=Integer.parseInt(request.getParameter("ds3"));
		int ds4=Integer.parseInt(request.getParameter("ds4"));
		int ds5=Integer.parseInt(request.getParameter("ds5"));
		
		
		int os1=Integer.parseInt(request.getParameter("os1"));
		int os2=Integer.parseInt(request.getParameter("os2"));
		int os3=Integer.parseInt(request.getParameter("os3"));
		int os4=Integer.parseInt(request.getParameter("os4"));
		int os5=Integer.parseInt(request.getParameter("os5"));
		
		int wt1=Integer.parseInt(request.getParameter("wt1"));
		int wt2=Integer.parseInt(request.getParameter("wt2"));
		int wt3=Integer.parseInt(request.getParameter("wt3"));
		int wt4=Integer.parseInt(request.getParameter("wt4"));
		int wt5=Integer.parseInt(request.getParameter("wt5"));
		
		String comment=request.getParameter("cmt");
		
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora5pm","oracle");
			ps=con.prepareStatement("insert into studentfeedback values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ServletContext sc=request.getServletContext();
			HttpSession hs=request.getSession();
			String id=(String)hs.getAttribute("id");
			ps.setInt(1, cp1);
			ps.setInt(2, cp2);
			ps.setInt(3, cp3);
			ps.setInt(4, cp4);
			ps.setInt(5, cp5);
			
			ps.setInt(6, java1);
			ps.setInt(7, java2);
			ps.setInt(8, java3);
			ps.setInt(9, java4);
			ps.setInt(10, java5);
			
			ps.setInt(11, ds1);
			ps.setInt(12, ds2);
			ps.setInt(13, ds3);
			ps.setInt(14, ds4);
			ps.setInt(15, ds5);
			
			ps.setInt(16, os1);
			ps.setInt(17, os2);
			ps.setInt(18, os3);
			ps.setInt(19, os4);
			ps.setInt(20, os5);
			

			ps.setInt(21, wt1);
			ps.setInt(22, wt2);
			ps.setInt(23, wt3);
			ps.setInt(24, wt4);
			ps.setInt(25, wt5);
			
			ps.setString(26, id);
			ps.setString(27, comment);
			Date d=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-YY");
			String date=sdf.format(d);
			
			System.out.println(date);
			ps.setString(28, date);
			int count=ps.executeUpdate();
			PrintWriter out=response.getWriter();
			System.out.println("records inserted:"+count);
			out.println("<h1><center>Records inserted:"+count+"</center><h1>");
		}
		catch(Exception e1) {
			e1.printStackTrace();
		
	}
		

	}
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}
}
