package com.prudhvi.aj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/tes")
public class student_log extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc=request.getServletContext();
		ServletContext sct= sc.getContext("/student_online");
		
	       String sid=request.getParameter("studentid");
	       String password=request.getParameter("studentpassword");
			
	       response.sendRedirect("http://localhost:9005/student_online/ts?studentid="+sid+"&studentpassword="+password+"&submit=Log+In");
	}
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
         this.doPost(request, response);
	}
}
