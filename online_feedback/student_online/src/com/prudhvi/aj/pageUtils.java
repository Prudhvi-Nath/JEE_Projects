package com.prudhvi.aj;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class pageUtils extends HttpServlet{
	
	
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{

		DBUtils db;
	stmarks sm;
		String sid=request.getParameter("studentid");
		String passw=request.getParameter("studentpassword");
		try {
			db=new DBUtils();
		sm=new stmarks();
			db.setId(sid);
			db.m1();
			PrintWriter out=response.getWriter();
			ServletContext st=request.getServletContext();
			HttpSession hs=request.getSession();
			hs.setAttribute("id", db.getId());
			
			st.setAttribute("stname", db.getName());
			st.setAttribute("gender", db.getGender());
			st.setAttribute("password",db.getPasswrd());
			st.setAttribute("socialpro", db.getSocialpro());
			st.setAttribute("ug", db.getUg());
			st.setAttribute("link", db.getLink());
			st.setAttribute("spec", db.getSpec());
			st.setAttribute("date", db.getDate());
			st.setAttribute("obj",db.getObject());
			st.setAttribute("obj1",db.getObject1());
			st.setAttribute("obj2",db.getObject2());
			st.setAttribute("obj3",db.getObject3());
			st.setAttribute("obj4",db.getObject4());
			
			
			String id=(String)hs.getAttribute("id");
			String pass=(String)st.getAttribute("password");
			String name=(String)st.getAttribute("stname");
			System.out.println("name:"+name);
			System.out.println("sid:"+sid);
			System.out.print("id:"+id);
			System.out.println("pass:"+pass);
			System.out.println("passw:"+passw);
			if(id.equals(sid)) {
					if(pass.equals(passw)) {
						
						RequestDispatcher rd=request.getRequestDispatcher("/st");
						rd.forward(request, response);
						
					      }
					  else {
						  out.println("<h1><center>Password Mismatch</center><h1>");
						     response.sendRedirect("OfficialPortal.html");
					     }
			    }
			else {
				out.println("<h1><center>User Account Not Available</center><h1>");
				response.sendRedirect("/OfficialPortal.html");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		
		
	}
	

}
