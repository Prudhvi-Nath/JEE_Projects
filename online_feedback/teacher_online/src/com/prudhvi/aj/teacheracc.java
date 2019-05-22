package com.prudhvi.aj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.PooledConnection;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

@WebServlet("/stuacc")
public class teacheracc extends HttpServlet {
	
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	@Override
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		String id=request.getParameter("studentid");
		String name=request.getParameter("studentname");
		String passwprd=request.getParameter("studentpassword");
		String gender=request.getParameter("studentgender");
		String dateofbirth=request.getParameter("studentbirth");
		String ug=request.getParameter("studentUG");
		String spec=request.getParameter("studentspec");
		String socialsite=request.getParameter("socialsite");
		String sociallink=request.getParameter("studentlink");
		String tech1=request.getParameter("first");
		String tech2=request.getParameter("second");
		String tech3=request.getParameter("third");
		String tech4=request.getParameter("fourth");
		String tech5=request.getParameter("fifth");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			OracleConnectionPoolDataSource ocp=new OracleConnectionPoolDataSource();
			ocp.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			ocp.setUser("ora5pm");
			ocp.setPassword("oracle");//it is set up with java appplication
			PooledConnection pc=ocp.getPooledConnection();	//and that connected to pooled connection manager
			Connection con=pc.getConnection();
			ps=con.prepareStatement("insert into student_details values(?,?,?,?,?,?,?,?,Technology(?,?,?,?,?),?)");
				ps.setString(1, id);
				ps.setString(2, name);
				ps.setString(3, passwprd);
				ps.setString(4, gender);
				ps.setString(5, ug);
				ps.setString(6, spec);
				ps.setString(7, socialsite);
				ps.setString(8, sociallink);
				ps.setString(9, tech1);
				ps.setString(10, tech2);
				ps.setString(11, tech3);
				ps.setString(12, tech4);
				ps.setString(13, tech5);
				ps.setString(14, dateofbirth);
				int count=ps.executeUpdate();
				Thread.sleep(2000);
				System.out.println("records inserted:"+count);
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				out.println("<h1><center>values inserted:"+count+"</center></h1>");
				con.close();
				ps.close();
				rs.close();
		} catch (ClassNotFoundException | SQLException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}
