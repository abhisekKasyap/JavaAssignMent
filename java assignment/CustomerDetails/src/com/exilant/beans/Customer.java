package com.exilant.beans;

public class Customer {
	private int custId;
	private Name custName;
	private double custIncome;
	private String custEmail;
	private Address custAddr;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public Name getCustName() {
		return custName;
	}
	public void setCustName(Name custName) {
		this.custName = custName;
	}
	public double getCustIncome() {
		return custIncome;
	}
	public void setCustIncome(double custIncome) {
		this.custIncome = custIncome;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public Address getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(Address custAddr) {
		this.custAddr = custAddr;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custIncome=" + custIncome + ", custEmail="
				+ custEmail + ", custAddr=" + custAddr + "]";
	}
	public Customer(int custId, Name custName, double custIncome, String custEmail, Address custAddr) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custIncome = custIncome;
		this.custEmail = custEmail;
		this.custAddr = custAddr;
	}
	
	public Customer(){}
}
