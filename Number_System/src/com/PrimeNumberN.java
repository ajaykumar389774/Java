package com;
import java.util.Scanner;
public class PrimeNumberN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	    int count=0;	
		for(int i=2;i<=n;i++)
		{
	
			boolean rs = isprime(i);
			if(rs)
			{
				count++;
			}
			}
		System.out.println(count);
		
		
	}
	
	static boolean isprime(int i)
	{
		for(int j=2;j<=i/2;j++)
		{
			
			if(i%j==0)
			return false;
			
		}
		return true;
	}
}