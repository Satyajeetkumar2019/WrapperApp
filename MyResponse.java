package com.nt.Wrappers;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.CharArrayWriter;
public class MyResponse extends HttpServletResponseWrapper {
	private HttpServletResponseWrapper response;
	private CharArrayWriter writer;
	public MyResponse(HttpServletResponse response) {
		super(response);
		this.response=(HttpServletResponseWrapper) response;
		writer=new CharArrayWriter();
	}//end of the method
	 public PrintWriter getWriter() throws IOException {
			PrintWriter pw=new PrintWriter(writer);
			return pw;
		}//end of the method 
public String toString() {
	return writer.toString();
}//end of the method
}//end of the class
