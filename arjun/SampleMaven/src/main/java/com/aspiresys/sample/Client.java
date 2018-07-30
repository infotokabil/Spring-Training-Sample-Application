package com.aspiresys.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {
public static void main(String args[])
{
	ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
    Samsung s=ap.getBean(Samsung.class);
    s.config();

}
	
	
}
