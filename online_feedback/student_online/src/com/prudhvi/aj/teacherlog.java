package com.prudhvi.aj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/teac")
public class teacherlog extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc=request.getServletContext();
		ServletContext sct= sc.getContext("/teacher_online");
		
			
		RequestDispatcher rd=sct.getRequestDispatcher("/teachlog");
		rd.forward(request, response);
	}

}
