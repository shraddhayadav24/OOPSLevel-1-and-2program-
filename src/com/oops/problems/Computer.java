package com.oops.problems;

public class Computer {

	private String processor;
	private int ram;
	private int storage;
	
	public Computer(String processor, int ram, int storage) {
		this.processor=processor;
		this.ram=ram;
		this.storage=storage;
	}
	
	public void printdeatils() {
		System.out.println("Processor:" +processor);
		System.out.println("Ram: "+ ram);
		System.out.println("Storage:" + storage);
	}
	
	public double CalculateComputer() {
		double baseprice=400;
		double ramPrice= ram * 5;
		double storageprice = storage * 0.1; 
		
		return baseprice + ramPrice + storageprice;
	}
	
	public static void main(String[] args) {
		Computer computer=new Computer("intel", 4, 64);
		computer.printdeatils();
		System.out.println("Price: "+ computer.CalculateComputer());
	}
	
}
