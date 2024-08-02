package com;

public class Average {
	public static void main(String[] args) {
		
		int arr[]= {24,35,65,78,87,56};
		
		System.out.println(arr.length);
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		int avg=sum/arr.length;
		System.out.println(avg);
	}

}
