package com.nt.Wrappers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequestWrapper;
public class MyRequest extends HttpServletRequestWrapper {
private HttpServletRequest request;
	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request=request;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getParameter(String name) {
	String values=request.getParameter(name);
	if(name.equals("uname")) {
		if(!values.endsWith("raja")) {
			return values;
		}//end of the block
		return values;
	}//end of the if block
	return values;
	}//end of the method 
	
}//end of the class
