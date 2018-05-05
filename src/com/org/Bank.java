package com.org;

public class Bank {
	private Customer customer;
	private String bankName;
	

	public Bank(Customer customer, String bankName) {
		System.out.println("Customer & bankName is injected through constructor in Bank(Customer,String)");
		this.customer = customer;
		this.bankName = bankName;
	}
	
	public void setCustomer(Customer customer) {
		System.out.println("Customer is injected through setter in setCustomer(Customer)");
		this.customer = customer;
	}
	public Customer getCustomer() {
		return customer;
	}
	public String getBankName() {
		return bankName;
	}
	
}
