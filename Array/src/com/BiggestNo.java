package com;

public class BiggestNo {
	
	public static void main(String[] args) {
		
		int ar[] = {24,35,65,89,45,99};
		System.out.println(ar.length);
		int big=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>big)
			{
				big=ar[i];
			}
		}
		System.out.println(big);
	}

}
