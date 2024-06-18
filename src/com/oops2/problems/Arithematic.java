package com.oops2.problems;

public class Arithematic {
	
	public static int findArithematic(int a, int b) {
		return a+b;
	}
	
	public static int findArithematic(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int findArithematic(int a, int b, int c,int d) {
		return a+b+c+d;
	}
	
public static void main(String[] args) {
	int result1=Arithematic.findArithematic(24, 45);
	System.out.println("The 1 arithematic sum is: "+ result1);
	
	int result2= Arithematic.findArithematic(45, 67, 35);
	System.out.println("The 2 arithematic sum is: "+ result2);
	
	int result3=Arithematic.findArithematic(34, 45, 12, 34);
	System.out.println("The 3 arithematic sum is: "+ result3);
}
}
