package com.oops2.problems;



public class Area {
	
	
	public double CalculateAreaofTriangle(double length, double breadth) {
		return 0.5*length*breadth;
	}
	
	public double CalculateAreaofRectangle(double length, double breadth) {
		return length * breadth;
	}
	
	
	
	
public static void main(String[] args) {
	
	Area area=new Area();
	Double Result=area.CalculateAreaofRectangle(5.0,6.0);
	System.out.println("The area of Rectangle:"+Result);
	
	Double Result2=area.CalculateAreaofTriangle(3.0, 6.0);
	System.out.println("The Area of Traingle:"+Result2);
	
	
	
}
}
