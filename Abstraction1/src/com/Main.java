package com;

public class Main {
	
	public static void main(String[] args) {
		
		Bank b = new Bankimpl();
		
		b.checkBalance();
		
		System.out.println("_____________________________________________________");
		
		b.deposit(3000);
		b.checkBalance();
		
		System.out.println("_______________________________________________________");
		
		b.withdraw(2000);
		b.checkBalance();
		
		
	}

}
