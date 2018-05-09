package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		Customer cust = (Customer)context.getBean("customer");
		System.out.println(cust.getAccount().getAccountNumber());
		System.out.println(cust.getAddress().getCity());
	}

}
