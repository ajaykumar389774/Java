package com;
import java.util.Scanner;
public class SumEvenOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int rs = iseven(n);
		System.out.println(rs);
		int re = isodd(n);
		System.out.println(re);
		
	}
	
	static int iseven(int n)
	{
		int temp=n; int even=0;
		do {
			int d=n%10;
			if(d%2==0)
			even=even+d;
			n=n/10;
		}while(n!=0);
		
		return even;
	}
	static int isodd(int n)
	{
		int temp=n; int odd=0;
		do {
			int d=n%10;
			if(d%2!=0)
			odd=odd+d;
			n=n/10;
		}while(n!=0);
		
		return odd;
	}
	
}
