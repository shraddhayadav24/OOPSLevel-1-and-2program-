package com.oops.problems;

public class TV {
	
	private String brand;
	private int size;
	private double price;
	

	public TV(String brand, int size, double price) {
		this.brand=brand;
		this.price=price;
		this.size=size;
	}
	
	public void printDetails() {
		System.out.println("Brand: "+brand);
		System.out.println("Size: "+size);
		double discountedprice = price*(1-CalculateDiscount());
		System.out.println("price with discount: "+ discountedprice);
	}
	
	public double CalculateDiscount() {
		double discount=0;
		if(size>=50) {
			discount = 0.5;
		}
		return discount;
	}
	public static void main(String[] args) {
		TV tv=new TV("videcon", 55, 12000);
		tv.printDetails();
		
	}
}
