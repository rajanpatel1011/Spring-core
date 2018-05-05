package com.org;

import java.util.Scanner;


public class Employee {
private String employeeName;
private int employeeAge;
private static String companyName;

public Employee() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name");
	setEmployeeName(sc.next());
	System.out.println("Enter Age");
	setEmployeeAge(sc.nextInt());
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getEmployeeAge() {
	return employeeAge;
}
public void setEmployeeAge(int employeeAge) {
	this.employeeAge = employeeAge;
}
public static String getCompanyName() {
	return companyName;
}
public static void setCompanyName(String companyName) {
	Employee.companyName = companyName;
}

}
