package com.aspire.designPatterns;

public class ComputerFactoryClass {
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
