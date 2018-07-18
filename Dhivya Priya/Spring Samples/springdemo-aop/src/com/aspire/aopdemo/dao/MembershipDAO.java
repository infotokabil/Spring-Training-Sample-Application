package com.aspire.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.aspire.aopdemos.Account;

@Component
public class MembershipDAO {

	public void addMember(Account account,int x){
		System.out.println("Adding a member");
	}
}
