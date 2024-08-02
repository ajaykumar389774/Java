package com;
import java.util.Scanner;
public class Fib {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		printfib(n);
		
		
	}
	
	static void printfib(int n)
	{
		int f1=0 ; int f2=1;
		
		while(n>0)
		{
			System.out.println(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			
		}
		
		
	}

}
