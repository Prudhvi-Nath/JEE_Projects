package com.prudhvi.aj;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sb")
@SuppressWarnings({"rawbytes","unchecked"})
public class EventOrgnisers extends HttpServlet implements Serializable {
	
	private String id;
	private String name;
	private String password;
	private String gender;
	private Long mobileno;
	private String dept;
	private String event;
	public EventOrgnisers()
    {

    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	ServletContext sct=null;
	@Override
	public void init(ServletConfig sc) {
		sct=sc.getServletContext();
	}
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		try {
			Connection con=ConnectionFactory.getMyConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from fest_event_org_create");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"-------"+rs.getString(2)+"----------"+rs.getString(3)+"-------"+rs.getString(4)+"-------"+rs.getLong(5)+"--------"+rs.getString(6)+"--------"+rs.getString(7));
				this.setId(rs.getString(1));
				this.setName(rs.getString(2));
				this.setPassword(rs.getString(3));
				this.setGender(rs.getString(4));
				this.setMobileno(rs.getLong(5));
				this.setDept(rs.getString(6));
				this.setEvent(rs.getString(7));
				

			}
			response.sendRedirect("College_Event_org.jsp");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
		doPost(request,response);
	}
	
}
