package com;

public class SumEvenOrOdd {
	
	public static void main(String[] args) {
		
		int arr[] = {25,44,99,88,45,65};
		
		System.out.println(arr.length);
		
		int esum=0;
		int osum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				esum=esum+arr[i];
			}
			
			else
			{
				osum=osum+arr[i];
			}
		
			
		}
		System.out.println(esum);
		System.out.println(osum);
		
		
		
	}

}
