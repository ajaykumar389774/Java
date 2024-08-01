package com;
import java.util.Scanner;
public class BiggestNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int a = big(n);
		
		System.out.println(a);
	}
	
	static int big(int n)
	{
		int big=-9;
		do {
			int d = n%10;
			if(d>big)
			{
				big=d;
			}
			n=n/10;

		}while(n!=0);
		
		
		return big;
	}

}
