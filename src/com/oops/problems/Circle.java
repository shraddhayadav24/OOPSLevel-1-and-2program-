package com.oops.problems;

public class Circle {
	
	private double radius;
	
	public  Circle (double radius) {
		this.radius=radius;
	}
	public double AreaofCircle(double radius) {
		return Math.PI*radius*radius;
	}
	
	public double CircumferenceOfCircle(double radius) {
		return 2*Math.PI*radius;
	}
	
	public double getradius() {
		return radius;
	}
	
//	public void setradius(double radius) {
//		 this.radius=radius;
//	}
	
	public static void main(String[] args) {
		Circle circle=new Circle(5.00);
		
		System.out.println("radius: "+circle.getradius());
		
		System.out.println("Area of circle: "+ circle.AreaofCircle(6.0));
		
		System.out.println("Circumference of circle:"+ circle.CircumferenceOfCircle(7.0));
	}
	
}
