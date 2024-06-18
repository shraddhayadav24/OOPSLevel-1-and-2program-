package com.oops.problems;

public class Furniture {
	
	private String type;
	private String materail;
	private int price;
	
	public Furniture(String type, String material, int price) {
		this.materail=material;
		this.price=price;
		this.type=type;
	}
	
	public void DisplayDetails() {
		System.out.println("Material: "+ materail);
		System.out.println("Type: "+ type);
		double discountedprice = price*(1-CalculateDiscount());
		System.out.println("Price: " + discountedprice);
		
	}
	
	public double CalculateDiscount() {
		double discount=0;
		if(materail.equals("wood")) {
			discount=0.5;
		}else if(materail.equals("metal")) {
			discount=0.3;
		}
		return discount;
	}
	
	public static void main(String[] args) {
		Furniture furniture=new Furniture("Chair", "wood", 3000);
		furniture.DisplayDetails();
		
		
	}
	
}
