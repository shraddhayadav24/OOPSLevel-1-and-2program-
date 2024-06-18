package com.oops.problems;

public class Mobile {
	
	private String make;
	private String model;
	private double storage;
	
	
	public Mobile(String make, String model, double storage) {
		this.make=make;
		this.model=model;
		this.storage=storage;
	}
	
	public void displayDetails() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Storage: "+storage);
	}
	
	public double CalculatePrice() {
		double baseprice=500;
		double pricePerGb=0.5;
		
	return baseprice +(pricePerGb * storage);
	}
	
	public static void main(String[] args) {
		Mobile mobile=new Mobile("Apple", "iphone", 128.0);
		
		System.out.println("price: "+mobile.CalculatePrice());
		mobile.displayDetails();
	}
	
}
