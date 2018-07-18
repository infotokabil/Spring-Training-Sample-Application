package com.aspire.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
	
	//this is where we add all our related advices for logging
	 
	//start using @Before advice
	
	@Pointcut("execution(public void add*(com.aspire.aopdemos.Account,..))")
	private void forDAOpackage(){}
		
	//@Before("forDAOpackage")
	@Before("execution(public void com.aspire.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice(){
		System.out.println("executing @before advice on addAccount()");
		
	}
	
	@Before("execution(public void com.aspire.aopdemo.dao.*.*(..))")
	
	public void beforeAddAdvice(){
		System.out.println("executing @before advice addAccount()");
		
		
	}
	
	

}
