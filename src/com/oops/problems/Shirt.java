package com.oops.problems;

public class Shirt {

	private String colour;
	private String size;
	private double price;
	
	public Shirt(String colour, String size, double price) {
		this.colour=colour;
		this.price=price;
		this.size=size;
	}
	
	public void displayDetails() {
		System.out.println("Colour: "+colour);
		double discountedprice = price*(1-CalculateDiscount());
		System.out.println("Price: "+ discountedprice);
		System.out.println("Size: "+size);
		
	}
	
	public double CalculateDiscount() {
		double discount=0.0;
		if(size.equals("S")) {
			discount=0.2;
		}else if(size.equals("M")) {
			discount=0.4;
		}
		return discount * price;
	}
	
	public static void main(String[] args) {
	Shirt shirt = new Shirt("Red", "M", 200.0);
	shirt.displayDetails();
}
}
