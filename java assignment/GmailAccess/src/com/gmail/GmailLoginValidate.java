package com.gmail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lv.do")
public class GmailLoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
				throws ServletException, IOException {
	
		
		String uName = request.getParameter("uname");
		String pass = request.getParameter("pwd");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// we will not have BL here instead we will have a 
		// class written like DAO which will connect to DB
		// and ack 
		if(uName.equals("Swathi") && pass.equals("india")){
		
			request.getRequestDispatcher("Home.do").forward(request, response);

		}else{
//			show error page 
			out.print("<html><body><h2 style='color:red'>Sorry Invalid Credentials</h2></body></html>");
			request.getRequestDispatcher("GmailLoginPage.html").include(request, response);
			
		}
	}
}



























