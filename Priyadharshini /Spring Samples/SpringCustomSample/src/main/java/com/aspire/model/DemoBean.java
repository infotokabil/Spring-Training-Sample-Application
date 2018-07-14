package com.aspire.model;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
 

public class DemoBean {
	@PostConstruct
	 public void customInit()
	    {
	        System.out.println("Method customInit() invoked...");
	    }
	 @PreDestroy
	    public void customDestroy()
	    {
	        System.out.println("Method customDestroy() invoked...");
	    }
}
