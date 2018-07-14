package com.aspire.model;

public class TrianglePoint {
	private Point a;
	private Point b;
	private Point c;	
	
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
	}
	
	public void draw(){
		System.out.println("Point A(" + getA().getX() + "," + getA().getY() + ")");
		System.out.println("Point A(" + getB().getX() + "," + getB().getY() + ")");
		System.out.println("Point A(" + getC().getX() + "," + getC().getY() + ")");
		System.out.println("\n\n");
	}


}
