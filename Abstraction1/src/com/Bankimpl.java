package com;

public class Bankimpl implements Bank {
	
int balance=5000;
	
	public void deposit(int amount)
	{
		System.out.println("Depositing " + amount);
		balance+=amount;
        System.out.println("Amount is Deposited Successfully");		
	}
	
	@Override
	public void withdraw(int amount)
	{
		System.out.println("Withdrawing " + amount);
		balance-=amount;
		System.out.println("Amount is withdraw Successfully");
		
		
	}
	
	@Override
	public void checkBalance()
	{
		System.out.println("Available balance : " + balance);
		
	}
	
}

