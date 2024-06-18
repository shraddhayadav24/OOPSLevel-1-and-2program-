package com.oops.problems;

public class Employee {

		private int id;
		private double salary;
		private String name;
		
		public Employee(int id, String name, double salary) {
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
		
		public void displayEmployee() {
			System.out.println("name: " + name);
			System.out.println("salary: " + salary);
			System.out.println("Id: "+ id);
		}
		
		
		public double calculateSalary() {
			return salary*12;
		}
		
		public static void main(String[] args) {
			Employee emp=new Employee(1, "shardul", 20000);
			
			emp.displayEmployee();
			
			double salary = emp.calculateSalary();
			System.out.println("yearly salary: "+ salary);
		}
		
}
