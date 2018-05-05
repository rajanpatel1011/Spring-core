package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contxt = new ClassPathXmlApplicationContext("beans2.xml");
		Employee e =(Employee)contxt.getBean("emp");
		Employee e2 = (Employee)contxt.getBean("emp");
		System.out.println("Name:"+e.getEmployeeName()+"Age"+e.getEmployeeAge()+"Company"+Employee.getCompanyName());
		System.out.println("Name:"+ e2.getEmployeeName()+"Age: "+e2.getEmployeeAge()+"Company"+Employee.getCompanyName());
		
		
				 Employee.setCompanyName("Microsoft");
				 System.out.println(e.getCompanyName());
	}

}
