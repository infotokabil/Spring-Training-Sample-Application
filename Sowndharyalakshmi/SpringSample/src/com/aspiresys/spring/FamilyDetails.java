package com.aspiresys.spring;

public class FamilyDetails {
	public String fname;
	public String mname;
	private String number;
	
	

	public FamilyDetails() {
	}

	public FamilyDetails(String fname, String mname, String number) {
		this.fname = fname;
		this.mname = mname;
		this.number = number;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void myinit() {
		System.out.println("initialised");
	}

	public void mydestroy() {
		System.out.println("Destroyed");
	}

	public String toString() {
		return "FamilyDetails [fname=" + fname + ", mname=" + mname + ", number=" + number + "]";
	}

}
