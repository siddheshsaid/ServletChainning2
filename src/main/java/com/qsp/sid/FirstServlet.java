
//USE OF HTTPSESSION USING REQUSET.SENDREDIRECT() AND REQUESTDISPATHER
package com.qsp.sid;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


	public class FirstServlet extends HttpServlet{
		protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
		{
			
//			RequestDispatcher rd=request.getRequestDispatcher("sec");
//			rd.forward(request, response);
			
			String s= request.getParameter("n1");
			
			HttpSession session=request.getSession();
			session.setAttribute("string", s);//string is just lable to use in other servlet
			response.sendRedirect("sec");
		}

	}


