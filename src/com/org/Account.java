package com.org;

import java.util.Scanner;

public class Account {
	private String accountType;

	public Account() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Type");
		setAccountType(sc.next());
	}
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
