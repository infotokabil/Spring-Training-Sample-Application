package com.aspire.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
	
	//this is where we add all our related advices for logging
	 

	
	@Pointcut("execution(public void com.aspire.aopdemo.dao.*.*(..))")
	private void forDAOpackage(){}
		
	@Before("forDAOpackage()")
	public void beforeAddAccountAdvice(JoinPoint jointPut){
		
		System.out.println("executing @before advice on method addAccount()");
		
		//display method signature
		
		MethodSignature signature = (MethodSignature)jointPut.getSignature();
		System.out.println("signature of method :  " + signature);
		
		//display method arguments
		
		//get args
		Object[] args = jointPut.getArgs();
		
		//loop through args
		for(Object temp : args){
			System.out.println("args "+ args);
		}
		
	}
		
	}
	
