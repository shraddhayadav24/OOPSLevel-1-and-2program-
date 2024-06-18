package com.oops2.problems;

public class Cuboid {
	
	public double perimeter(double length, double breadth, double hieght) {
		return  4*(length+breadth+hieght);
	}
	
	public double area(double length, double breadth, double hieght) {
		double perimeter=perimeter(length, breadth, hieght);
		return 2*(length*breadth + breadth*hieght + hieght*length);
	}
	
	public double volume(double length, double breadth, double hieght) {
		double area=area(length, breadth, hieght);
		return area*hieght;
	}
	
public static void main(String[] args) {
	Cuboid cuboid=new Cuboid();
	
	Double volume= cuboid.volume(12, 13, 14);
	System.out.println("The volume of cuboid is: "+ volume);
}
}
