package com.oops.problems;

public class BankAccount {
	
	private double balance;
	private int AccountNo;
	
	
	public BankAccount(double initialbalance, int AccountNo) {
		this.AccountNo=AccountNo;
		this.balance=initialbalance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposit Amount: "+ amount);
		}else {
			System.out.println("Invalid amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("withdrwan: "+amount);
		}else if(amount<0) {
			System.out.println("invalid amount");
	}else {
		System.out.println("insufficient balance");
	}
}
	public double getbalance() {
		return balance;
	}
	
	public int getAccountNo() {
		return AccountNo;
	}
	
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount(10000, 123456);
		System.out.println("Account number: "+ bankAccount.getAccountNo());
		System.out.println("Balance: " + bankAccount.getbalance());
		
		bankAccount.deposit(500);
		System.out.println("current balance: "+ bankAccount.getbalance());
		
		bankAccount.withdraw(300);
		System.out.println("after withdrawal: " + bankAccount.getbalance());
		
		
		
	}
	
	
	
}