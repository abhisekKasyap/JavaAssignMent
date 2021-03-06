package com.exilant.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exilant.beans.Address;
import com.exilant.beans.Customer;
import com.exilant.beans.Name;
import com.exilant.dao.CustomerDAO;

/**
 * Servlet implementation class SelectCustomer
 */
@WebServlet("/SelectCust")
public class SelectCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		if (request.getParameter("Select All") == "Select All") {
			CustomerDAO customerDAO = new CustomerDAO();
			Customer customer = new Customer();
			customer.setCustId(Integer.parseInt(request.getParameter("custId")));
			customer.setCustName(new Name(request.getParameter("fName"), request.getParameter("lName")));
			customer.setCustIncome(Double.parseDouble(request.getParameter("custIncome")));
			customer.setCustEmail(request.getParameter("custEmail"));
			customer.setCustAddr(
					new Address(Integer.parseInt(request.getParameter("custHno")), request.getParameter("custStreet"),
							request.getParameter("custCity"), Integer.parseInt(request.getParameter("custPin"))));

			customerDAO.getCustomer(customer.getCustId());

			if (new CustomerDAO().getCustomer(customer.getCustId()) != null) {

				String path = "/CustomerDetails/views/Success.jsp";
				request.setAttribute("CUSTOMER", customer);
				request.getRequestDispatcher(path).forward(request, response);

			} else {
				String path = "/CustomerDetails/views/Failure.jsp";
				request.setAttribute("CUSTOMER", customer);
				request.getRequestDispatcher(path).forward(request, response);

			}

		}
	}

}
