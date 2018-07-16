package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
		public static void main(String[] args) {
			ApplicationContext appContext = new ClassPathXmlApplicationContext(
					new String[] { "aop.xml" });

			CustomerServcice cust = (CustomerServcice) appContext.getBean("customerService");

			System.out.println("*************************");
			cust.printName();
			System.out.println("*************************");
			cust.printURL();
			System.out.println("*************************");
			try {
				cust.printThrowException();
			} catch (Exception e) {

			}

		}
	
}
