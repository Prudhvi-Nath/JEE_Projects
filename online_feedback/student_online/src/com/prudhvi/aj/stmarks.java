package com.prudhvi.aj;

import java.io.IOException;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/st")
public class stmarks  extends HttpServlet implements Serializable {
	private int telugu;
	private int hindi;
	
	private int english;
	private int maths;
	private int science;
	private int social;
	private int total;
	private int percentage;
	private String id;

	public int getTelugu() {
		return telugu;
	}


	public void setTelugu(int telugu) {
		this.telugu = telugu;
	}


	public int getHindi() {
		return hindi;
	}


	public void setHindi(int hindi) {
		this.hindi = hindi;
	}


	public int getEnglish() {
		return english;
	}


	public void setEnglish(int english) {
		this.english = english;
	}


	public int getMaths() {
		return maths;
	}


	public void setMaths(int maths) {
		this.maths = maths;
	}


	public int getScience() {
		return science;
	}


	public void setScience(int science) {
		this.science = science;
	}


	public int getSocial() {
		return social;
	}


	public void setSocial(int social) {
		this.social = social;
	}
	public int getTotal() {
		return total;
		
	}
	public void setTotal(int total) {
		this.total=total;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage=percentage;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}


	


	


	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException  {
			HttpSession hs = null;
			Connection con=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
		
			
		try {
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora5pm","oracle");
			
			ps=con.prepareStatement("select * from studentmarks where id=?");
			hs=request.getSession();
			ServletContext st=request.getServletContext();
			String id=(String)hs.getAttribute("id");
			
			System.out.println(id);
				ps.setString(1, id);

				rs=ps.executeQuery();
				while(rs.next()) {
					this.setTelugu(rs.getInt("telugu"));
					this.setHindi(rs.getInt("hindi"));
					this.setEnglish(rs.getInt("english"));
					this.setMaths(rs.getInt("maths"));
					this.setScience(rs.getInt("science"));
					this.setSocial(rs.getInt("social"));
					this.setTotal(rs.getInt("total"));
					this.setId(id);
					this.setPercentage(rs.getInt("percentage"));
				
					
					System.out.println(rs.getInt("telugu")+"--------"+rs.getInt("hindi")+"-------"+rs.getInt("english")+"-------"+rs.getInt("maths")+"-------"+rs.getInt("science")+"---------"+rs.getInt("social")+"-------"+rs.getInt("total")+"-----"+rs.getInt("percentage")+"----------"+rs.getString("id"));
					
					st.setAttribute("telugu", this.getTelugu());
					st.setAttribute("hindi", this.getHindi());
					st.setAttribute("english", this.getEnglish());
					st.setAttribute("maths", this.getMaths());
					st.setAttribute("science", this.getScience());
					st.setAttribute("social", this.getSocial());
					st.setAttribute("tot", this.getTotal());
					System.out.println(this.getTotal());
					st.setAttribute("percentage", this.getPercentage());
					
				                            }
					 
					
					if(id.equals(this.getId())) {
						RequestDispatcher rd=request.getRequestDispatcher("/sa");
						rd.forward(request, response);
					      }
		}
					
					
				 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	
		
	}
	

