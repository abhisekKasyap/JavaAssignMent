package com.exilant.interfaces;

import java.util.List;

import com.exilant.beans.Customer;

public interface ICustomerDAO {
	// insert
	public boolean insertCustomer(Customer cust);

	// delete
	public boolean deleteCustomer(int custId);

	// select
	public Customer getCustomer(int custId);

}
