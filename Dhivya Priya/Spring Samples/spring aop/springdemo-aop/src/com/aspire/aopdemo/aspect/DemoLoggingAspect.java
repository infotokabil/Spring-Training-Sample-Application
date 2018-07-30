package com.aspire.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class DemoLoggingAspect {
	
	//this is where we add all our related advices for logging
	 
	//start using @Before advice
	
	
	@Pointcut("execution(public void com.aspire.aopdemo.dao.*.*(..))")
	private void forDAOpackage(){}
	
	/*@Pointcut("execution(* com.aspire.aopdemo.dao.*.get*(..))" )
	private void forGetter(){}
	
	@Pointcut("execution(* com.aspire.aopdemo.dao.*.set*(..))" )
	private void forSetter(){} 
	
	 //include package exclude getter and setter
	@Pointcut("forDAOpackage() && !(forGetter() || forSetter())")
	private void forpackageNotForGetterSetter(){}
		
	@Before("forpackageNotForGetterSetter()")*/
	
	@Before("forDAOpackage()")
	//@Before("execution(public void com.aspire.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice(){
		System.out.println("executing @before advice on addAccount() - 1");
		
	}
	
	@Before("forDAOpackage()")
	//@Before("execution(public void com.aspire.aopdemo.dao.*.*(..))")
	
	public void beforeAddAdvice(){
		System.out.println("executing @before advice addAccount() - 2");
		
		
	}
	
	

}
