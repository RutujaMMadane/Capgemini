package com.bean;

public class Customer {
	
	private Address address;
	public Customer()
	{
		
	}
	public Customer(Address address)
	{
		super();
		this.address=address;
		
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address=address;
		
	}

}
