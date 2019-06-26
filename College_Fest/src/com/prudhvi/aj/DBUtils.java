package com.prudhvi.aj;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/ad")
public class DBUtils extends HttpServlet implements Serializable{
	private String id;
	private String name;
	private String pass;
	private String gender;
	private int age;
	private String blood_grp;
	private String qualification;
	private String department;
	private String role;
	private int exp;
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBlood_grp() {
		return blood_grp;
	}
	public void setBlood_grp(String blood_grp) {
		this.blood_grp = blood_grp;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	ServletContext sct=null;
	@Override
	public void init(ServletConfig sc) {
		sct=sc.getServletContext();
	}
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		
		HttpSession hs=null;
		try {
			String id=request.getParameter("adminid");
			String pass=request.getParameter("pwd");
			
			Connection con=ConnectionFactory.getMyConnection();
			PreparedStatement ps=con.prepareStatement("select * from fest_admin where id=?");
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+"-----------"+rs.getString(2)+"--------"+rs.getString(3)+"------"+rs.getString(4)+"--------"+rs.getInt(5)+"-------"+rs.getString(6)+"-------"+rs.getString(7)+"------"+rs.getString(8)+"-------"+rs.getString(9)+"---------"+rs.getInt(10));
				this.setId(rs.getString(1));
				this.setName(rs.getString(2));
				this.setPass(rs.getString(3));
				this.setGender(rs.getString(4));
				this.setAge(rs.getInt(5));
				this.setBlood_grp(rs.getString(6));
				this.setQualification(rs.getString(7));
				this.setDepartment(rs.getString(8));
				this.setRole(rs.getString(9));
				this.setExp(rs.getInt(10));
				if(id.equals(rs.getString(1))) {
					  if(pass.equals(rs.getString(3))) {
						  hs=request.getSession();
						  hs.setAttribute("id", rs.getString(1));
						  sct.setAttribute("name",rs.getString(2));
						  sct.setAttribute("pass", rs.getString(3));
						  sct.setAttribute("gender", rs.getString(4));
						 sct.setAttribute("age", this.getAge());
						  sct.setAttribute("blood_grp",rs.getString(6));
						  sct.setAttribute("qualification", rs.getString(7));
						  sct.setAttribute("department", rs.getString(8));
						  sct.setAttribute("role", rs.getString(9));
						  sct.setAttribute("exp", rs.getString(10));
						  
							
						  response.sendRedirect("College_Event_Sup_admin.jsp");
					  }
					  else 
						  response.sendRedirect("College_Event_Admin.html");
					  
				}
				else 
					response.sendRedirect("College_Event_Admin.html");
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
			// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println(e.getMessage());
	e.initCause(new IOException("THis is Worst Case"));
		}	
	}
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		doPost(request,response);
	}
	
}
