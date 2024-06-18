package com.oops.problems;

public class Student {
	private int id;
	private String name;
	private int age;
	
	
	
	public Student(int id, String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void displayStudent() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("Id: "+ id);
	}
	
	public static void main(String[] args) {
		Student stud=new Student(1, "shraddha", 24);
		
		stud.displayStudent();
	}
}
