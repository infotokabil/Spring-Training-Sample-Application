package SpringSample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("dssdfsdfsdfsdf");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorldsss");
		System.out.println("333333333333333333333333");
		obj.getMessage();
		context.registerShutdownHook();
	}
}
