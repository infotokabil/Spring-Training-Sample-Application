package springBeanInheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {

	public static void main(String[] args) {

	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

	      CustomerBean cust = (CustomerBean)context.getBean("customerBean");
	      System.out.println("country = " +cust.getCountry());
	      

	}

}
