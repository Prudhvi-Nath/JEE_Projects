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
@WebServlet("/stmar")
public class teacherstudmarks extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		int telugu=Integer.parseInt(request.getParameter("telugu"));
		int hindi=Integer.parseInt(request.getParameter("hindi"));
		int english=Integer.parseInt(request.getParameter("english"));
		int maths=Integer.parseInt(request.getParameter("maths"));
		int science=Integer.parseInt(request.getParameter("science"));
		int social=Integer.parseInt(request.getParameter("social"));
		String id=request.getParameter("id");
		int total=telugu+hindi+english+maths+science+social;
		int percentage=total/6;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			OracleConnectionPoolDataSource ocp=new OracleConnectionPoolDataSource();
			ocp.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			ocp.setUser("ora5pm");
			ocp.setPassword("oracle");//it is set up with java appplication
			PooledConnection pc=ocp.getPooledConnection();	//and that connected to pooled connection manager
			//PooledConnection is an interface
			Connection con=pc.getConnection();//then by that creating connection to database
			//getConnection() is a abstract method with the return type Connection
			System.out.println(con);
			PreparedStatement ps=con.prepareStatement("insert into studentmarks values(?,?,?,?,?,?,?,?,?)");
					ps.setInt(1, telugu);
					ps.setInt(2, hindi);
					ps.setInt(3, english);
					ps.setInt(4, maths);
					ps.setInt(5, science);
					ps.setInt(6, social);
					ps.setInt(7, percentage);
					ps.setString(8, id);
					ps.setInt(9, total);
					
					int count =ps.executeUpdate();
					response.setContentType("text/html");
					PrintWriter out=response.getWriter();
					out.println("<h1><center>Record inserted:"+ count+"</center></h1>");
					System.out.println("records inserted:"+count);
					con.close();
					ps.close();
					
					
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PrintWriter out=response.getWriter();
			out.println("<h1><center>"+e.getMessage()+" </center></h1>");
			
		}
		
	}
	
}
