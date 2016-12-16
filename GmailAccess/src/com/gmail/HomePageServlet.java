package com.gmail;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/Home.do")
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().println("Welcome to Gmail Home page " + request.getParameter("uname"));
		response.getWriter().println("<hr/>Choose from the below options<hr />");
		response.getWriter().println("<a href='Inbox.do'>Inbox</a><br>");
		response.getWriter().println("<a href='Sent.do'>SentItems</a><br>");
		response.getWriter().println("<a href='Compose.do'>Compose</a><br>");
		response.getWriter().println("<a href='Draft.do'>Draft</a><br>");
		response.getWriter().println("<br><br><form action='GmailLoginPage.html' method='post'><table> <tr> <td> <input name='Logout' value='Logout' type='submit' />  <td /> <tr /> <table /><form />");
		
		//response.getWriter().println("<button name='logout' type='button'>");
		
		//response.getWriter().println("<br><br><table><tr><td> <a href='GmailLoginPage.html'>Logout</a> <td /><tr /><table />"); 
		
	}

}
