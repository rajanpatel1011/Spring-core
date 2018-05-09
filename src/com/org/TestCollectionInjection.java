package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
			TelecomServices airtelService = (TelecomServices)context.getBean("airtel4g");
			System.out.println(airtelService.getLocation());
			System.out.println(airtelService.getUrl());
				System.out.println(airtelService.getCredentials());
			
			TelecomServices ideaService = (TelecomServices) context.getBean("idea4g");
			System.out.println(ideaService.getLocation());
			System.out.println(ideaService.getUrl());
	}

}
