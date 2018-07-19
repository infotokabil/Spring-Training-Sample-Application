package com.aspire.springsample;

public class FirstClass implements FirstInterface{
	
	//define a private field for dependency
	private SecondInterface secondInterface;
	private String userName;
	private String office;
	
	
	public String getOffice() {
		return office;
	}


	public void setOffice(String office) {
		this.office = office;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public FirstClass() {
		super();
		// TODO Auto-generated constructor stub
	}


	//define a constructor for dependency injection
	public FirstClass(SecondInterface thesecondInterface){
		secondInterface=thesecondInterface;
	}
	
	
	public String getDetails(){
		return "My first spring project";
	}
   
	public String getSentence(){
		return secondInterface.getInformation();
	}
	
	public void init(){
		System.out.println("FirstClass : inside start method");
	}
	public void destroy(){
		System.out.println("FirstClass : inside clean up method");
	}
	
}
