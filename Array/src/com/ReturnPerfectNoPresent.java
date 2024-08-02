package com;
import java.util.Scanner;
public class ReturnPerfectNoPresent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		
		int n =sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int r = isdigit(arr);
		
		System.out.println(r);
		
		
	}
	
	static int isdigit(int[] x)
	{
		int count=0;
		
		for(int i=0;i<x.length;i++)
		{
			boolean rs = isperfect(x[i]);
			if(rs)
			{
				count++;
			}
			
		}
		
		return count;
	}
	
	static boolean isperfect(int x)
	{
		int temp=x;
		int sum=0;
		
		for(int i=1;i<=x/2;i++)
		{
			if(x%i==0)
			{
				sum=sum+i;
			}
				
		}
		
		return sum==temp;
	}
	
}
