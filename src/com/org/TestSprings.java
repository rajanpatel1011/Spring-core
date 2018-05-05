package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSprings {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		Bank b = (Bank)context.getBean("bank1");
		System.out.println("Bank Name: "+b.getBankName());
		
		System.out.println("Bank Name:"+b.getBankName());
	}
}
 	