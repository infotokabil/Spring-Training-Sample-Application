package com.aspire.factory;

import java.util.Scanner;

public class Factorymain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the OS type");
		String s = sc.nextLine();
		operatingsystemfactory o = new operatingsystemfactory();
		OS obj = o.getinstance(s);
		obj.spec();

	}
}
