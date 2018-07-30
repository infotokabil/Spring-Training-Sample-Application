package com.aspire.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.aspire.aopdemos.Account;

@Component("data")
public class AccountDAO {
	
	public void addAccount(Account theAccount, boolean flag){
		System.out.println(getClass()+": doing db work, adding an account");
	}

	public String doWork(){
		return "hello";
	}
	
	public void getInfo(){
		System.out.println("Poincut demo");
	}
}
