package com;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
		int arr[] = {24,35,44,67,89,56};
		
		System.out.println(arr.length);
		
		int count=0;
		int count1=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
		
	}

}
