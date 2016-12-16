package com.exilant.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exilant.beans.Address;
import com.exilant.beans.Customer;
import com.exilant.beans.Name;
import com.exilant.connection.GetDBConnection;
import com.exilant.interfaces.ICustomerDAO;

public class CustomerDAO implements ICustomerDAO {

	@Override
	public boolean insertCustomer(Customer cust) {
		String sql = "insert into customer values(?,?,?,?,?,?,?,?,?)";

		GetDBConnection gc = new GetDBConnection();
		try {
			gc.ps = GetDBConnection.getOracleConn().prepareStatement(sql);
			gc.ps.setInt(1, cust.getCustId());
			gc.ps.setString(2, cust.getCustName().getfName());
			gc.ps.setString(3, cust.getCustName().getlName());
			gc.ps.setDouble(4, cust.getCustIncome());
			gc.ps.setString(5, cust.getCustEmail());
			gc.ps.setInt(6, cust.getCustAddr().getCustHno());
			gc.ps.setString(6, cust.getCustAddr().getCustStreet());
			gc.ps.setString(6, cust.getCustAddr().getCustCity());
			gc.ps.setInt(6, cust.getCustAddr().getCustPin());
			
			
			

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;

	}

	@Override
	public boolean deleteCustomer(int custId) {

		GetDBConnection gc = new GetDBConnection();
		String sql = "delete from Customer where custId =?";
		try {
			gc.ps = GetDBConnection.getOracleConn().prepareStatement(sql);
			gc.ps.setInt(1, custId);

			return gc.ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public Customer getCustomer(int custId) {
		GetDBConnection gc = new GetDBConnection();
		String sql = "select custId, custfName, custlName, custIncome, custEmail, custHno, custStreet, custCity, custPin from customer where custId =?";
		try {
			gc.ps = GetDBConnection.getOracleConn().prepareStatement(sql);
			gc.ps.setInt(1, custId);

			gc.rs = gc.ps.executeQuery();

			// this starts from -1
			if (gc.rs.next()) {
				Customer cust = new Customer();
				Name name = new Name();
				Address address = new Address();

				cust.setCustId(gc.rs.getInt(1));
				name.setfName(gc.rs.getString("custfName"));
				name.setlName(gc.rs.getString("custlName"));
				cust.setCustName(name);
				cust.setCustIncome(gc.rs.getDouble(4));
				cust.setCustEmail(gc.rs.getString(5));
				address.setCustHno(gc.rs.getInt(6));
				address.setCustStreet(gc.rs.getString(7));
				address.setCustCity(gc.rs.getString(8));
				address.setCustPin(gc.rs.getInt(9));
				cust.setCustAddr(address);
				return cust;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


}
