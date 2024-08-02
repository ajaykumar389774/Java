package com;

public class SmallerNo {

	public static void main(String[] args) {
		
		int arr[] = {24,35,56,78,90,25};
		
		System.out.println(arr.length);
		int small=arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		
		System.out.println(small);
	}
	
}
