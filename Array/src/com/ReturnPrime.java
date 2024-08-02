package com;
import java.util.Scanner;
public class ReturnPrime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int res = isdigit(arr);
		
		System.out.println(res);
	}
	
	static int isdigit(int [] x)
	{
		int count=0;
		
		for(int i=0;i<x.length;i++)
		{
			boolean prime = isprime(x[i]);
			if(prime)
			{
				count++;
			}
			
		}
		
		return count;
		
	}
	
	static boolean isprime(int n)
	{
		if(n==1||n==0)
			return false;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		  return true;
       		
	}

}
