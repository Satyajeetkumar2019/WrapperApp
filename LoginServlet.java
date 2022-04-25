package com.nt.Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//create variable 
		String uname=null;
		String pwd=null;
		PrintWriter pw=null;
		//Read from data 
		uname=req.getParameter("uname");
		pwd=req.getParameter("pwd");
		System.out.println(uname+"and "+pwd);
		//write b.logic 
		if(uname.equals("raja")&&pwd.equals("rani"))
			pw.println("<h1 style='color:green'>Valid Credentials</h1>");
		else
			pw.println("<h1 style='color:green'> not Valid Credentials</h1>");
		//add hyper link
		pw.println("<a href='login.html'>Home</a>");
		System.out.println("Request object class"+req.getClass());
		System.out.println("Response object class"+res.getClass());
		//close stream object 
		pw.close();
	}//end of the method
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}//end of the method 

}//end of the class
