package com.prudhvi.aj;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class gosignin extends GenericServlet {
		@Override
		public void service(ServletRequest request,ServletResponse response) throws IOException,ServletException{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			HttpServletRequest hr=(HttpServletRequest)request;
			HttpServletResponse hs=(HttpServletResponse)response;
			out.println("<body bgcolor='orangered'>");
			out.println("<h2>This is Servlet in login</h2>");
			out.println("</body>");
			ServletContext sc= getServletContext();
			ServletContext sct= sc.getContext("/SignUpServlet");
					
			RequestDispatcher rd=sct.getRequestDispatcher("/signup");
			rd.forward(request, response);
		}
		
		@Override
		public void destroy() {
			
		}
}
