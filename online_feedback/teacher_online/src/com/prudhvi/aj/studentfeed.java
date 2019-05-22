package com.prudhvi.aj;

import java.io.IOException;
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
@WebServlet("/sf")
public class studentfeed extends HttpServlet {
	private int one;
	private int two;
	private int three;
	private int four;
	private int five;
	private int six;
	private int seven;
	private int eight;
	private int nine;
	private int ten;
	private int eleven;
	private int twelve;
	private int thirteen;
	private int fourteen;
	private int fiveteen;
	private int sixteen;
	private int seventeen;
	private int eightteen;
	private int nineteen;
	private int twenty;
	private int twentyone;
	private int twentytwo;
	private int twentythree;
	private int twentyfour;
	private int twentyfive;
	private String id;
	private String cmt;
	private String dateoff;
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
public int getOne() {
		return one;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public int getTwo() {
		return two;
	}
	public void setTwo(int two) {
		this.two = two;
	}
	public int getThree() {
		return three;
	}
	public void setThree(int three) {
		this.three = three;
	}
	public int getFour() {
		return four;
	}
	public void setFour(int four) {
		this.four = four;
	}
	public int getFive() {
		return five;
	}
	public void setFive(int five) {
		this.five = five;
	}
	public int getSix() {
		return six;
	}
	public void setSix(int six) {
		this.six = six;
	}
	public int getSeven() {
		return seven;
	}
	public void setSeven(int seven) {
		this.seven = seven;
	}
	public int getEight() {
		return eight;
	}
	public void setEight(int eight) {
		this.eight = eight;
	}
	public int getNine() {
		return nine;
	}
	public void setNine(int nine) {
		this.nine = nine;
	}
	public int getTen() {
		return ten;
	}
	public void setTen(int ten) {
		this.ten = ten;
	}
	public int getEleven() {
		return eleven;
	}
	public void setEleven(int eleven) {
		this.eleven = eleven;
	}
	public int getTwelve() {
		return twelve;
	}
	public void setTwelve(int twelve) {
		this.twelve = twelve;
	}
	public int getThirteen() {
		return thirteen;
	}
	public void setThirteen(int thirteen) {
		this.thirteen = thirteen;
	}
	public int getFourteen() {
		return fourteen;
	}
	public void setFourteen(int fourteen) {
		this.fourteen = fourteen;
	}
	public int getFiveteen() {
		return fiveteen;
	}
	public void setFiveteen(int fiveteen) {
		this.fiveteen = fiveteen;
	}
	public int getSixteen() {
		return sixteen;
	}
	public void setSixteen(int sixteen) {
		this.sixteen = sixteen;
	}
	public int getSeventeen() {
		return seventeen;
	}
	public void setSeventeen(int seventeen) {
		this.seventeen = seventeen;
	}
	public int getEightteen() {
		return eightteen;
	}
	public void setEightteen(int eightteen) {
		this.eightteen = eightteen;
	}
	public int getNineteen() {
		return nineteen;
	}
	public void setNineteen(int nineteen) {
		this.nineteen = nineteen;
	}
	public int getTwenty() {
		return twenty;
	}
	public void setTwenty(int twenty) {
		this.twenty = twenty;
	}
	public int getTwentyone() {
		return twentyone;
	}
	public void setTwentyone(int twentyone) {
		this.twentyone = twentyone;
	}
	public int getTwentytwo() {
		return twentytwo;
	}
	public void setTwentytwo(int twentytwo) {
		this.twentytwo = twentytwo;
	}
	public int getTwentythree() {
		return twentythree;
	}
	public void setTwentythree(int twentythree) {
		this.twentythree = twentythree;
	}
	public int getTwentyfour() {
		return twentyfour;
	}
	public void setTwentyfour(int twentyfour) {
		this.twentyfour = twentyfour;
	}
	public int getTwentyfive() {
		return twentyfive;
	}
	public void setTwentyfive(int twentyfive) {
		this.twentyfive = twentyfive;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCmt() {
		return cmt;
	}
	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	public String getDateoff() {
		return dateoff;
	}
	public void setDateoff(String dateoff) {
		this.dateoff = dateoff;
	}
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		
		String sid=request.getParameter("selectionstud");
		System.out.println(id);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ora5pm","oracle");
			ps=con.prepareStatement("select * from studentfeedback where id=?");
			ps.setString(1, sid);
			rs=ps.executeQuery();
			while(rs.next()) {
				this.setOne(rs.getInt(1));
				this.setTwo(rs.getInt(2));
				this.setThree(rs.getInt(3));
				this.setFour(rs.getInt(4));
				this.setFive(rs.getInt(5));
				this.setSix(rs.getInt(6));
				this.setSeven(rs.getInt(7));
				this.setEight(rs.getInt(8));
				this.setNine(rs.getInt(9));
				this.setTen(rs.getInt(10));
				this.setEleven(rs.getInt(11));
				this.setTwelve(rs.getInt(12));
				this.setThirteen(rs.getInt(13));
				this.setFourteen(rs.getInt(14));
				this.setFiveteen(rs.getInt(15));
				this.setSixteen(rs.getInt(16));
				this.setSeventeen(rs.getInt(17));
				this.setEightteen(rs.getInt(18));
				this.setNineteen(rs.getInt(19));
				this.setTwenty(rs.getInt(20));
				this.setTwentyone(rs.getInt(21));
				this.setTwentytwo(rs.getInt(22));
				this.setTwentythree(rs.getInt(23));
				this.setTwentyfour(rs.getInt(24));
				this.setTwentyfive(rs.getInt(25));
				this.setId(rs.getString(26));
				this.setCmt(rs.getString(27));
				this.setDateoff(rs.getString(28));
				System.out.println(rs.getInt(1)+"-------"+rs.getInt(2)+"----------"+rs.getInt(3)+"-------"+rs.getInt(4)+"----------"+rs.getInt(5)+"-------"
						+"-------"+rs.getInt(6)+"----------"+rs.getInt(7)+"-------"+rs.getInt(8)+"----------"+rs.getInt(9)+"-----"
						+rs.getInt(10)+"----------"+
						rs.getInt(11)+"-------"+rs.getInt(12)+"----------"+rs.getInt(13)+"-------"+rs.getInt(14)+"----------"+rs.getInt(15)+"-------"
						+"-------"+rs.getInt(16)+"----------"+rs.getInt(17)+"-------"+rs.getInt(18)+"----------"+rs.getInt(19)+"-----"
						+rs.getInt(20)+"----------"+rs.getInt(21)+"-------"+rs.getInt(22)+"----------"+rs.getInt(23)+"-------"+rs.getInt(24)+"-------"+rs.getInt(25)+
						"-------"+rs.getString(26)+"--------"+rs.getString(27)+"--------"+rs.getString(28));
				HttpSession hs=request.getSession();
				ServletContext st=request.getServletContext();
				st.setAttribute("one", rs.getInt(1));
				st.setAttribute("two", rs.getInt(2));
				st.setAttribute("three", rs.getInt(3));
				st.setAttribute("four", rs.getInt(4));
				st.setAttribute("five", rs.getInt(5));
				st.setAttribute("six", rs.getInt(6));
				st.setAttribute("seven", rs.getInt(7));
				st.setAttribute("eight", rs.getInt(8));
				st.setAttribute("nine", rs.getInt(9));
				st.setAttribute("ten", rs.getInt(10));
				st.setAttribute("eleven", rs.getInt(11));
				st.setAttribute("twelve", rs.getInt(12));
				st.setAttribute("thirteen", rs.getInt(13));
				st.setAttribute("fourteen", rs.getInt(14));
				st.setAttribute("fiveteen", rs.getInt(15));
				st.setAttribute("sixteen", rs.getInt(16));
				st.setAttribute("seventeen", rs.getInt(17));
				st.setAttribute("eighteen", rs.getInt(18));
				st.setAttribute("nineteen", rs.getInt(19));
				st.setAttribute("twenty", rs.getInt(20));
				st.setAttribute("twentyone", rs.getInt(21));
				st.setAttribute("twentytwo", rs.getInt(22));
				st.setAttribute("twentythree", rs.getInt(23));
				st.setAttribute("twentyfour", rs.getInt(24));
				st.setAttribute("twentyfive", rs.getInt(25));
				st.setAttribute("tid", rs.getString(26));
				st.setAttribute("cmt", rs.getString(27));
				st.setAttribute("dateoff", rs.getString(28));
					
				
			}
			
			/*RequestDispatcher rd=request.getRequestDispatcher("/teacherstudentfeed1.jsp");
			rd.forward(request, response);
			*/
			response.sendRedirect("http://localhost:9005/teacher_online/teacherstudentfeed1.jsp");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	          }
		
		
	}	

}
