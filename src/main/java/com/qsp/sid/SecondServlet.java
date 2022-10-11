package com.qsp.sid;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
//		String s= request.getParameter("n1");
//		System.out.println(s);
//		
		HttpSession session=request.getSession();
		String s1= session.getAttribute("string").toString();// CAUSE GETATTRIBUTE WILL GIVE US OBJECT AND WE WANT TO CONVERT IT TO STRING
		PrintWriter out= response.getWriter();
		out.print("WELCOME to second servlet"+" "+s1);
//		
		
}
}