package com.org;

import java.util.Scanner;

public class Customer {
	
	private String customerName;
	private Account account;
	
	public Customer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		setCustomerName(sc.next());
	}
	
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		
		this.account = account;
	}
}
