package com.oops2.problems;

import java.util.Scanner;

public class ByteCasting {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the 2 Number");
	byte byte1=scanner.nextByte();
	byte byte2=scanner.nextByte();
	
	int sum=(int)byte1 + (int)byte2;
	System.out.println(sum);
	
	scanner.close();
	
}
}
