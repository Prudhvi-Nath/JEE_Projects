package com.prudhvi.aj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {
	@Override
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException {
		MyRequest mrequest=null;
		MyResponse mresponse=null;
		PrintWriter pw=null;
		mrequest=new MyRequest((HttpServletRequest)req);
		mresponse=new MyResponse((HttpServletResponse)res);
		chain.doFilter(mrequest, mresponse);
		String output=mresponse.toString();
		output=output+"NIT Ammerpet";
		pw=res.getWriter();
		pw.println(output);
		
		
		
	}
	@Override
	public void init(FilterConfig fc) {
		
	}


}
