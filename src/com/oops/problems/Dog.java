package com.oops.problems;

public class Dog {
	
	private int age;
	private int wieght;
	private String breed;
	
	public Dog(int age, int wieght, String breed) {
		this.age=age;
		this.breed=breed;
		this.wieght=wieght;
	}
	
	public int CalculateAge() {
		int humanyear=0;
		
		if(age<=2) {
			humanyear=age*11;
		}else {
			humanyear=22+(age-2)*5;
		}
		return humanyear;
	}
	
	public void printdetails() {
		System.out.println("Age: "+ age + " in human age is "+ CalculateAge() );
		System.out.println("Wieght: "+ wieght);
		System.out.println("Breed: "+breed);
	}
	public static void main(String[] args) {
		Dog dog =new Dog(5, 65, "labourdor");
		dog.CalculateAge();
		dog.printdetails();
	}
}
