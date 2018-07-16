package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import AOP.ClassService;;

public class App {
		public static void main(String[] args) {
			ApplicationContext appContext = new ClassPathXmlApplicationContext(
					new String[] { "bean2.xml" });

			ClassService cust = (ClassService) appContext.getBean("customerServiceProxy");

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

