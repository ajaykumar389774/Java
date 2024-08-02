package com;
import java.util.Scanner;
public class ReturnSumEvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int[] r = isdigit(arr);
		System.out.println("The sum of even no " + r[0]);
		System.out.println("The sum of odd no " + r[1]);
		
		
	}
	
	static int[] isdigit(int[] x)
	{
		
		int esum=0;
		int osum=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				esum=esum+x[i];
			}
			
			else
			{
				osum=osum+x[i];
			}
			
			
			
		}
		
		int sum[]= {esum,osum};
		
		return sum;
	}
	
	
}
