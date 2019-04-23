package com.prudhvi.aj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet extends GenericServlet {
	@Override
	public void service(ServletRequest request1,ServletResponse response1) throws IOException {
		HttpServletRequest request=(HttpServletRequest)request1;
		HttpServletResponse response=(HttpServletResponse)response1;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<body bgcolor='orangered'>");
		out.println("<h2>This is Servlet SignUpServlet</h2>");
		String email=request1.getParameter("email");
		String frstname=request1.getParameter("firstname");
		String scndname=request1.getParameter("secondname");
		String pswd=request1.getParameter("pwd");
		String repswd=request1.getParameter("reenterpwd");
		if(pswd.equals(repswd)) {
			
			generalservlet gs=new generalservlet();
			gs.setEmail(email);
			gs.setFirstname(frstname);
			gs.setLastname(scndname);
			gs.setPassword(pswd);
			gs.setReenterpassword(repswd);
			DBdetails db=new DBdetails();
			db.insert(gs);
			
		
		}
		else {
			
			 response.sendRedirect("./SignUp.html");
		}
		out.println("</body>");
	}
}
