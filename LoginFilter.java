package com.nt.Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import com.nt.Wrappers.MyRequest;
import com.nt.Wrappers.MyResponse;
public class LoginFilter  implements Filter {
	public void init(FilterConfig con) {
	}//end of the init() method
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		MyRequest mreq=null;
		MyResponse mres=null;
		String output=null;
		PrintWriter pw=null;
		//create customar request object 
		mreq=new MyRequest((HttpServletRequest)req);
		//Create cuntomer response object 
		mres=new MyResponse((HttpServletResponse)res);
		//call chain method 
		chain.doFilter(req,res);
	output=mres.toString().toUpperCase();
	//add signnature 
		output=output+"HCL ,Ameerpet";
		//write response to broser 
		pw=res.getWriter();
		pw.println(output);
	}//end of the method
	public void destroyed() {
	}//end of the method 
	
}//end of the class
