package com.prudhvi.aj;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.*;
public class DBServlet implements Serializable {
		private String emailname;
		private String emailpassword;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		public void setEmailname(String emailname) {
			this.emailname=emailname;
			
		}
		public String getEmailname()  {
			
			return emailname;
		}
		public void setEmailpassword(String emailpassword) {
			this.emailpassword=emailpassword;
		}
		public String getEmailpassword() {
			getResult();
			return emailpassword;
		} 
		public DBServlet() {
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ora5pm", "oracle");
			if(con!=null) {
				
				System.out.println("connection established:"+con);
			}
			else {
				System.out.println("connection object not created");
			}
			}
			catch(SQLException se) {
				System.out.println("no suitable driver found:"+se.getMessage());
			}
			catch(ClassNotFoundException ce) {
				System.out.println("no sutiable oracle class found:"+ce.getMessage());
			}
		}
		public void getResult()  {
			try {
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora5pm","oracle");
				 ps=con.prepareStatement("select email,password from emp10to1 where email=?");
				ps.setString(1,emailname);
				 rs=ps.executeQuery();
					while(rs.next()) {
					
						
						System.out.println(rs.getString("email")+"-------------------------"+rs.getString("password"));
						this.setEmailpassword(rs.getString("password"));
					}
				}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
		
		}
}
