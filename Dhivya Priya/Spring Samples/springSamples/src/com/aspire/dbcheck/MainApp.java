package com.aspire.dbcheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class MainApp {

	public static void main(String[] args) {
		
		 
		    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationconxt.xml");
		    
		      
		    EmployeDAO dao=(EmployeDAO)ctx.getBean("edao");  
		    int status=dao.saveEmployee(new Employee(151,"Dhivya",15000));  
		    System.out.println(status);  
		          
		   
		      
		}  
		  
		}  

	


