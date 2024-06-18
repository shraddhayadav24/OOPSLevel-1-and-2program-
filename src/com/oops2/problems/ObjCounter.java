package com.oops2.problems;

public class ObjCounter {
	
	public static int  counter =0;
	public   ObjCounter() {
		
		  counter++;
		
	}
	
	public static void main(String[] args) {
	ObjCounter counter=new ObjCounter();
	ObjCounter counter2=new ObjCounter();
	System.out.println("No of objects created: "+ ObjCounter.counter);
	}
}
