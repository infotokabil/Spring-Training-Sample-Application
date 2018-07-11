package com.aspiresys.designpattern;import javax.management.InstanceAlreadyExistsException;

public class Main {
	public static void main(String[] args) {
	   //EnumSingleton.INSTANCE.display();
	   EnumSingleton enumSingleton=EnumSingleton.INSTANCE;
	   EnumSingleton.INSTANCE.s=(EnumSingleton.INSTANCE.s).toUpperCase();
	   System.out.println(EnumSingleton.INSTANCE.s);
	   System.out.println(EnumSingleton.INSTANCE.display());
	   System.out.println(enumSingleton.s);
	}


}
