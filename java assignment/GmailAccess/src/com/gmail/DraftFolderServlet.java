package com.gmail;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DraftServlet
 */
@WebServlet("/Draft.do")
public class DraftFolderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().println("<hr />Hi i'm in Draft <hr />");
		response.getWriter().println("<a href='Inbox.do'>Inbox</a><br>");
		response.getWriter().println("<a href='Sent.do'>SentItems</a><br>");
		response.getWriter().println("<a href='Compose.do'>Compose</a><br>");
		response.getWriter().println("<br><br><form action='GmailLoginPage.html' method='post'><table> <tr> <td> <input name='Logout' value='Logout' type='submit' />  <td /> <tr /> <table /><form />");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}


















