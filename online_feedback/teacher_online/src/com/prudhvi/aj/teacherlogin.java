package com.prudhvi.aj;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Struct;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/teachlog")
public class teacherlogin extends HttpServlet implements Serializable {
		
	
	static Connection con=null;
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	private String name;
	private String id;
	private String dob;
	private String gender;
	private String dept;
	private String branch;
	private String bloodgrp;
	private int join;
	private String[] object;
	private String[] object1;
	private String[] object2;
	private String[] object3;
	
	public String getObject1() {
		return object1[1];
	}

	public void setObject1(String[] object1) {
		this.object1 = object1;
	}

	public String getObject2() {
		return object2[2];
	}

	public void setObject2(String[] object2) {
		this.object2 = object2;
	}

	public String getObject3() {
		return object3[3];
	}

	public void setObject3(String[] object3) {
		this.object3 = object3;
	}

	private String password;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBloodgrp() {
		return bloodgrp;
	}

	public void setBloodgrp(String bloodgrp) {
		this.bloodgrp = bloodgrp;
	}

	public int getJoin() {
		return join;
	}

	public void setJoin(int join) {
		this.join = join;
	}

	public String getObject() {
		return object[0];
	}

	public void setObject(String[] object) {
		this.object = object;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		String sid=request.getParameter("facultyid");
			String pass=request.getParameter("facultypassword");
			System.out.println(sid);
			System.out.println(pass);
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora5pm","oracle");
				ps=con.prepareStatement("select * from teacherlogin where id=?");
				ps.setString(1, sid);
				rs=ps.executeQuery();
				while(rs.next()) {
					Struct st=(Struct)rs.getObject(9);
					Object o[]=st.getAttributes();
					String s[] = Arrays.asList(o)
							.toArray(new String[o.length]);
							//.toArray(new String[objectArray.length]);

					
					System.out.println(rs.getString(1)+"---------"+rs.getString(2)+"-----"+rs.getString(3)+"------"+rs.getString(4)+"------"+rs.getString(5)+"--------"+rs.getString(6)+"------"+rs.getString(7)+"---------"+rs.getInt(8)+"------"+o[0]+"------"+o[1]+"----------"+o[2]+"--------"+o[3]+"---------"+rs.getString(10));
					this.setName(rs.getString("name"));
					this.setId(rs.getString(2));
					this.setDob(rs.getString("dob"));
					this.setGender(rs.getString("gender"));
					this.setDept(rs.getString("dept"));
					this.setBranch(rs.getString("branch"));
					this.setBloodgrp(rs.getString("bloodgrp"));
					this.setJoin(rs.getInt("join"));
					this.setObject(s);
					this.setObject1(s);
					this.setObject2(s);
					this.setObject3(s);
					
					System.out.println(this.getObject());
					System.out.println(this.getObject1());
					System.out.println(this.getObject2());
					System.out.println(this.getObject3());
					
				
					ServletContext sc=request.getServletContext();
					ServletContext sct= sc.getContext("/online_feedback");
					HttpSession hs=request.getSession();
					hs.setAttribute("teacid",this.getId());
					sc.setAttribute("sidteac",this.getId());
					sc.setAttribute("name", this.getName());
					sc.setAttribute("dob", this.getDob());
					sc.setAttribute("gender",this.getGender());
					sc.setAttribute("dept", this.getDept());
					sc.setAttribute("branch",this.getBranch());
					sc.setAttribute("bloodgrp",this.getBloodgrp());
					sc.setAttribute("join",this.getJoin());
					sc.setAttribute("obj",this.getObject());
					sc.setAttribute("obj1",this.getObject1());
					sc.setAttribute("obj2",this.getObject2());
					sc.setAttribute("obj3",this.getObject3());
					sc.setAttribute("pass",this.getPassword());
					PrintWriter out=response.getWriter();
					if(sid.equals(rs.getString(2))) {
						if(pass.equals(rs.getString(10))) {
					/*		RequestDispatcher rd=request.getRequestDispatcher("/s");
							rd.forward(request, response);*/
							response.sendRedirect("http://localhost:9005/teacher_online/teacherprofile.jsp");
						}
						else {
							
							out.println("<body><script>alert('password mismatch')</script></body>");
						}
					}
					else if((sid.equals(rs.getString(2)))!=true) {
						out.println("<body><p>userid invalid</p></body>");
						
					}
				}
				
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}
