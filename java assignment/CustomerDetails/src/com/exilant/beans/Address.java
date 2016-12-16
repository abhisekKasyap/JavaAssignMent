package com.exilant.beans;

public class Address {
	private int custHno;
	private String custStreet;
	private String custCity;
	private int custPin;
	public int getCustHno() {
		return custHno;
	}
	public void setCustHno(int custHno) {
		this.custHno = custHno;
	}
	public String getCustStreet() {
		return custStreet;
	}
	public void setCustStreet(String custStreet) {
		this.custStreet = custStreet;
	}
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	public int getCustPin() {
		return custPin;
	}
	public void setCustPin(int custPin) {
		this.custPin = custPin;
	}
	@Override
	public String toString() {
		return "Address [custHno=" + custHno + ", custStreet=" + custStreet + ", custCity=" + custCity + ", custPin="
				+ custPin + "]";
	}
	public Address(int custHno, String custStreet, String custCity, int custPin) {
		super();
		this.custHno = custHno;
		this.custStreet = custStreet;
		this.custCity = custCity;
		this.custPin = custPin;
	}
	
	public Address(){}
	
}
