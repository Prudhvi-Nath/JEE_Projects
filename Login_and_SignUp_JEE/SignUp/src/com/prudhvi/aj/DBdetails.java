package com.prudhvi.aj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DBdetails {
	
	public void insert(generalservlet gs){
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora5pm","oracle");
		if(con!=null) {
				System.out.println("Connection established");
				PreparedStatement ps=con.prepareStatement("insert into emp10to1 values(?,?,?,?,?)" );
				ps.setString(1, gs.getEmail() );
				ps.setString(2, gs.getFirstname());
				ps.setString(3, gs.getLastname());
				ps.setString(4, gs.getPassword());
				ps.setString(5, gs.getReenterpassword());
					int count=ps.executeUpdate();
				System.out.println("recorde inserted:"+count);
					
			}
	   }
		catch(SQLException se) {
			System.out.println("driver not  found Exception:");
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("Class not Found Exception:"+cnfe);
		}
	}
	
}
