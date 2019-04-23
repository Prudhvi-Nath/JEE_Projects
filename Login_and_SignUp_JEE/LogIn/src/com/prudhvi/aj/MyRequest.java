package com.prudhvi.aj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequest extends HttpServletRequestWrapper {
	private HttpServletRequest request;
	
	MyRequest(HttpServletRequest request){
		super(request);
		this.request=request;
	}
	public String getParameter(String name) {
		String value=request.getParameter(name);
		if(name.equals("username")) {
			if(!value.endsWith("@gmail.com")){
				return value+"@gmail.com";
			        }
			}
		return value;
		
	}

}
