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
@WebServlet("/sa")
public class statten extends HttpServlet implements Serializable {
	private int january;
	private int febuary;
	private int march;
	private int april;
	private int may;
	private int june;
	private int july;
	private int augest;
	private int september;
	private int october;
	private int november;
	private int december;
	private String id;
private int total;
	
	private int year;
	private String dateenter;

	public String getDateenter() {
		return dateenter;
	}


	public void setDateenter(String dateenter) {
		this.dateenter = dateenter;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	
	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	
	
	public int getJanuary() {
		return january;
	}


	public void setJanuary(int january) {
		this.january = january;
	}


	public int getFebuary() {
		return febuary;
	}


	public void setFebuary(int febuary) {
		this.febuary = febuary;
	}


	public int getMarch() {
		return march;
	}


	public void setMarch(int march) {
		this.march = march;
	}


	public int getApril() {
		return april;
	}


	public void setApril(int april) {
		this.april = april;
	}


	public int getMay() {
		return may;
	}


	public void setMay(int may) {
		this.may = may;
	}


	public int getJune() {
		return june;
	}


	public void setJune(int june) {
		this.june = june;
	}


	public int getJuly() {
		return july;
	}


	public void setJuly(int july) {
		this.july = july;
	}


	public int getAugest() {
		return augest;
	}


	public void setAugest(int augest) {
		this.augest = augest;
	}


	public int getSeptember() {
		return september;
	}


	public void setSeptember(int september) {
		this.september = september;
	}


	public int getOctober() {
		return october;
	}


	public void setOctober(int october) {
		this.october = october;
	}


	public int getNovember() {
		return november;
	}


	public void setNovember(int november) {
		this.november = november;
	}


	public int getDecember() {
		return december;
	}


	public void setDecember(int december) {
		this.december = december;
	}
	
	public String getId() {
	return id;	
	}
	public void setId(String id) {
	this.id=id;	
	}


	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException  {
			HttpSession hs = null;
			Connection con=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
		
			
		try {
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora5pm","oracle");
		    			ps=con.prepareStatement("select * from student_attd where id=?");
			hs=request.getSession();
			ServletContext st=request.getServletContext();
			String sid=(String)hs.getAttribute("id");
			System.out.println("sid:"+sid);
				ps.setString(1, sid);
			
				rs=ps.executeQuery();
				while(rs.next()) {
					this.setJanuary(rs.getInt("january"));

					this.setFebuary(rs.getInt("febuary"));
					this.setMarch(rs.getInt("march"));
					this.setApril(rs.getInt("april"));
					this.setMay(rs.getInt("may"));
					this.setJune(rs.getInt("june"));
					this.setJuly(rs.getInt("july"));
					this.setAugest(rs.getInt("augest"));
					this.setSeptember(rs.getInt("september"));
					this.setOctober(rs.getInt("october"));
					this.setNovember(rs.getInt("november"));
					this.setDecember(rs.getInt("december"));
					this.setTotal(rs.getInt("total"));
				    this.setId(rs.getString("id"));
				    this.setDateenter(rs.getString("dateenter"));
				    this.setYear(rs.getInt("year"));

				    
					System.out.println(rs.getInt("january")+"--------"+rs.getInt("febuary")+"-------"+rs.getInt("march")+"-------"+rs.getInt("april")+"-------"+rs.getInt("may")+"---------"+rs.getInt("june")+"-------"+rs.getInt("july")+"-----"+rs.getInt("augest")+"-------"+rs.getInt("september")+"---------"+rs.getInt("october")+"--------"+rs.getInt("november")+"-------"+rs.getInt("december")+"------"+rs.getInt("total"));
					
					st.setAttribute("january", this.getJanuary());
					st.setAttribute("febuary", this.getFebuary());
					st.setAttribute("march", this.getMarch());
					st.setAttribute("april", this.getApril());
					st.setAttribute("may", this.getMay());
					st.setAttribute("june", this.getJune());
					st.setAttribute("july", this.getJuly());
					st.setAttribute("augest", this.getAugest());
					st.setAttribute("september", this.getSeptember());
					st.setAttribute("october", this.getOctober());
					st.setAttribute("november", this.getNovember());
					st.setAttribute("december", this.getDecember());
					st.setAttribute("total", this.getTotal());
					if(this.getId().equals(sid)) {
						RequestDispatcher rd=request.getRequestDispatcher("/studentprofile.jsp");
						rd.forward(request, response);
					}
					else {
						
					}
				                            }
					 
					
					
		}
					
					
				 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	
		
	}
	




