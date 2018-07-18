package com.aspire.springsample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("data")
@Scope(value="singleton")
public class FirstClass implements FirstInterface {
	
	public FirstClass(){
		System.out.println("FirstClass :inside default constructor");
	}

	@Autowired
	@Qualifier("fourthClass")
	private SecondInterface secondInterface;

	//property file injection
	@Value("${office}")
	private String office;
	
	public String getOffice() {
		return office;
	}

	@Autowired //(can use field injection , no need of setter or constructor injection)
	private ThirdClass thirdClass;
	
	
	/*//constructor injection
	@Autowired
	
	public FirstClass(SecondInterface secondInterface){
		this.secondInterface=secondInterface;
	}*/
	
//	@Autowired
	public FirstClass(ThirdClass thirdClass){
		this.thirdClass=thirdClass;
		System.out.println("FirstsdfsaffdClass :inside default constructor");
	}
	
	//setter injection(it can be applied for normal method also, just do change the name of the method here to see it)
	//@Autowired
	public void setFirstClass(ThirdClass thirdClass){
		this.thirdClass=thirdClass;
	}
	
	
	@Override
	public String getDetails() {
		return "Hello user !!!";

	}
   
	public String getSecondInterface(){
		
		return secondInterface.getFromSecondInterface();
	}
	
	public String method1ThirdClass(){
		return thirdClass.getMessage();
	}
	
	public String method2ThirdClass(){
		return thirdClass.getInfo();
	}

	@PostConstruct
	public void start(){
		System.out.println("FirstClass : inside start method");
	}
	
	@PreDestroy
	public void cleanUp(){
		System.out.println("FirstClass : inside clean up method");
	}
	
}
