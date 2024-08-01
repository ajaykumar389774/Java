package com;
import java.util.Scanner;
public class SumOfDigits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int rs = sum(n);
		System.out.println(rs);
		
	}
	
	
	static int sum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}

}
