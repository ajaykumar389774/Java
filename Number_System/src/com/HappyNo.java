package com;
import java.util.Scanner;
public class HappyNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean rs=ishappy(n);
		
		if(rs)
		{
			System.out.println(n+ "   is a happy no");
		}
		else
			System.out.println(n + " is not a happy no ");
	}
	
	static boolean ishappy(int n) //89
	{ 
		while(n>9)
		{
		int sum=0;
		do {
		 int d=n%10;//89 --- 9  --- 8%10 ---- 8
		 sum=sum+d*d; //0+84-- 84  ---- 84+8*8---- 84+64 -- 145
		 n=n/10; //89/10 --- 8
		 
		}while(n!=0);
		n=sum;
		}
		return n==1||n==7;
	}

}
