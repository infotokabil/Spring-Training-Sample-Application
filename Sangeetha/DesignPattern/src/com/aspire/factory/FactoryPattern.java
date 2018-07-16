package com.aspire.factory;

public class FactoryPattern {

	public static void main(String[] args) {
		
		Instance instance = new Instance();
		EmployeeSalary obj = instance.getInstance("develop");
		obj.calculateSalary();
		
	}

}
