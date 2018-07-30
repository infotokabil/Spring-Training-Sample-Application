package com.aspire.factory;

public class Instance {
	
	public EmployeeSalary getInstance(String str)
	{
		if(str.equals("support"))
		return new Support();
		
		else if(str.equals("develop"))
			return new Development();
		
		else
			return new Facility();
		
	}

}
