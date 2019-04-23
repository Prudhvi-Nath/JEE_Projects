package com.prudhvi.aj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
 String email1=null;
	 String emailpass=null;
	HttpSession session=null;
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(uname+"-----------"+password);
		DBServlet db  = new DBServlet();
				db.setEmailname(uname);
				 email1=db.getEmailname();
				 emailpass=db.getEmailpassword();
				 System.out.println(this.email1+"---------------"+this.emailpass);
		
		out.println("<body bgcolor='yellow'>");
		if(email1.equals(uname)&&emailpass.equals(password)) {
			out.println("<h1 style='color:green'>Valid creditials</h1>");
			 session = request.getSession(true); // reuse existing
				session.setAttribute("emailid", email1);
					session.setMaxInactiveInterval(30); // 30 seconds
					if (session != null) {
						if (session.getAttribute("emailid") != null) {
							String name = (String) session.getAttribute("emailid");
							out.print("Hello, " + name + "  Welcome to ur Profile");
						} else {
							response.sendRedirect("Login.html");
						}
					}
						
			
				}
		else {
			out.println("<h1>Invalid creditials</h1>");
			response.sendRedirect("Login.html");
		
			}
		out.println("<h1><a href='./Login.html'>Home</a></h1>");
		System.out.println("Object class name:"+request.getClass());
		System.out.println("Object class name:"+response.getClass());
		
		out.println("<body>");
	}                     
	
}
