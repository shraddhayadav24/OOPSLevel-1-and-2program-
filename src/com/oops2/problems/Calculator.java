package com.oops2.problems;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	int no1,no2;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the First no: ");
	no1=scanner.nextInt();
	System.out.println("Enter the second no: ");
	no2=scanner.nextInt();
	
	int result=add(no1,no2);
	System.out.println("The result is: "+result);
	
	scanner.close();
	
}
public static int add(int no1,int no2) {
	return no1+no2;
	
}
}
