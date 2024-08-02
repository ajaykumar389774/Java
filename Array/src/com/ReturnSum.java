package com;
import java.util.Scanner;
public class ReturnSum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=isdigit(arr);
		System.out.println(sum);
		
	}
	
	static int isdigit(int[]x)
	{
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
			
		}
		
		return sum;
	}

}
