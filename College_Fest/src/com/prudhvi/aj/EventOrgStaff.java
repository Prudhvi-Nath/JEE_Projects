package com.prudhvi.aj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/ks")
public class EventOrgStaff extends HttpServlet {
	ServletContext sct=null;
	@Override
	public void init(ServletConfig config) {
		sct=config.getServletContext();
	}
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	HttpSession hs=request.getSession();
		String id=(String) hs.getAttribute("orgid");
		System.out.println(id);
			Connection con;
			try {
				con = ConnectionFactory.getMyConnection();
				PreparedStatement ps=con.prepareStatement(" select * from fest_event_Staff_Create where rownum<=1 and orgid=?");
				ps.setString(1,id);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					System.out.println(rs.getString(1)+"-----"+rs.getString(2)+"-------"+rs.getString(3)+"-------"+rs.getLong(4)+"--------"+rs.getString(5)+"--------"+rs.getString(6));
					sct.setAttribute("staffid",rs.getString(1));
					sct.setAttribute("namestaffing",rs.getString(2));
					sct.setAttribute("gend",rs.getString(3));
					sct.setAttribute("mobilen",rs.getLong(4));
					sct.setAttribute("evnt",rs.getString(5));
					sct.setAttribute("orgid1",rs.getString(6));
					sct.setAttribute("depts1", rs.getString(7));
					}
					RequestDispatcher rd=request.getRequestDispatcher("./ks1");
					rd.forward(request, response);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
	}
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		doPost(request,response);
	}
}
