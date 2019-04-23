package com.prudhvi.aj;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class MyResponse extends HttpServletResponseWrapper {
		private HttpServletResponse response;
		private CharArrayWriter writer=null;
		MyResponse(HttpServletResponse response){
			super(response);
			this.response=response;
		}
	public PrintWriter getWriter() throws IOException {
	writer=new CharArrayWriter();
		PrintWriter pw=new PrintWriter(writer);
		return pw;
	}
	@Override
	public String toString() {
		return writer.toString();
	}
}
