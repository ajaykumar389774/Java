package com;
import java.util.Scanner;
public class ReturnBig {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the values " +n);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int big = isbig(arr);
		
		System.out.println(big);
		
		
	}
	
	
	static int isbig(int [] x)
	{
		int big=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>big)
			{
				big=x[i];
			}
		}
		
		return big;
		
	}
	}


