package com;
import java.util.Scanner;
public class SumOfPrimeNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean rs = isprime(n);
		
		if(rs)
		{
			System.out.println( n +  " it is a prime no");
		}
		else
		{
			System.out.println(n +  " it it not a prime no");
		}
	}
	
	static boolean isprime(int n)
	{
		for(int j=2;j<=n/2;j++)
		{
			if(n%j==0)
				return false;
		}
		
		return true;
	}

}
