package BeanAliasing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Shape {
	public static void main(String[]args){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		TrianglePoint obj = (TrianglePoint)context.getBean("triangle-alias");
		obj.draw();
	}
}
