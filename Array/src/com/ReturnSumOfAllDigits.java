package com;
import java.util.Scanner;
public class ReturnSumOfAllDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int rs=isdigit(arr);
		
		System.out.println(rs);
		
	}
	
	static int isdigit(int [] x)
	{
		int sum=0;
		
		for(int i=0;i<x.length;i++)
		{
			sum=sum+issum(x[i]);
			
		}
		
		return sum;
	}
	
	static int issum(int x)
	{
		int sum=0;
		do {
			int d=x%10;
			sum=sum+d;
			x=x/10;
			
		}while(x!=0);
		
		return sum;
	}
	
	
}
