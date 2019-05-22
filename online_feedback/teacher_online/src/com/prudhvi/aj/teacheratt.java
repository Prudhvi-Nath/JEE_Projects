package com.prudhvi.aj;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.PooledConnection;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

import java.util.Date;
import java.text.SimpleDateFormat;
@WebServlet("/ta")
public class teacheratt extends HttpServlet{
	
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		int january=Integer.parseInt(request.getParameter("january"));
		int febuary=Integer.parseInt(request.getParameter("febuary"));
		int march=Integer.parseInt(request.getParameter("march"));
		int april=Integer.parseInt(request.getParameter("april"));
		int may=Integer.parseInt(request.getParameter("may"));
		int june=Integer.parseInt(request.getParameter("june"));
		int july=Integer.parseInt(request.getParameter("july"));
		int auguest=Integer.parseInt(request.getParameter("auguest"));
		int september=Integer.parseInt(request.getParameter("september"));
		int october=Integer.parseInt(request.getParameter("october"));
		int november=Integer.parseInt(request.getParameter("november"));
		int december=Integer.parseInt(request.getParameter("december"));
		
		int total=(january+febuary+march+april+may+june+july+auguest+september+october+november+december)/12;
		int year=Integer.parseInt(request.getParameter("year"));

		String id=request.getParameter("sid");
		System.out.println(id);
		String date1=request.getParameter("date");
		SimpleDateFormat sd2=new SimpleDateFormat("dd-MM-yyyy");//is in same format of s2
		Date d1;
		String s4 = null;
		try {
			d1 = sd2.parse(date1);
			System.out.println("parsing:"+d1);//parsing:Thu Nov 21 00:00:00 IST 1996
			SimpleDateFormat sd3=new SimpleDateFormat("dd-MMM-yy");//is in same format of s2
			s4=sd3.format(d1);
			System.out.println("format:"+s4);
			
		
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ServletContext st=request.getServletContext();
		st.setAttribute("sum", total);
		Connection con=null;;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			OracleConnectionPoolDataSource ocp=new OracleConnectionPoolDataSource();
			ocp.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			ocp.setUser("ora5pm");
			ocp.setPassword("oracle");//it is set up with java appplication
			PooledConnection pc=ocp.getPooledConnection();	//and that connected to pooled connection manager
			 con=pc.getConnection();
			
			
			ps=con.prepareStatement("insert into student_attd values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			
			ps.setInt(1, january);
			ps.setInt(2,febuary);
			ps.setInt(3, march);
			ps.setInt(4, april);
			ps.setInt(5, may);
			ps.setInt(6, june);
			ps.setInt(7, july);
			ps.setInt(8, auguest);
			ps.setInt(9, september);
			ps.setInt(10, october);
			ps.setInt(11, november);
			ps.setInt(12, december);
			ps.setInt(13,total);
			ps.setString(14,id);
			ps.setInt(15,year);
			ps.setString(16,s4);
			int count=ps.executeUpdate();
			System.out.println("records inserted:"+count);
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<h1><center>Record inserted:"+ count+"</center></h1>");
			System.out.println("records inserted:"+count);
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<h1><center>:"+e.getMessage()+"</center></h1>");
			
			e.printStackTrace();
		}
		
		
		
		
	}
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		this.doPost(request,response);
	}
}
