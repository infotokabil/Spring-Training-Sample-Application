package com.aspire.aopdemos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aspire.aopdemo.dao.AccountDAO;
import com.aspire.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
    //read spring config java class
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
	
	//get the bean from spring container
	AccountDAO accountDAO = applicationContext.getBean("data",AccountDAO.class);
	
	MembershipDAO membershipDAO = applicationContext.getBean("membershipDAO",MembershipDAO.class);
	
	//call the business method
	Account account = new Account();
	accountDAO.addAccount(account,true);
	
	System.out.println("-------------------------------------------------------------------------");
	membershipDAO.addMember(account, 5);
	
	accountDAO.doWork();

	}

}
