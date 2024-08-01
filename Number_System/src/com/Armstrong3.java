package com;
import java.util.Scanner;
public class Armstrong3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean rs=arm(n);
		
		if(rs)
		{
			System.out.println(n + " is a ArmStrong");
		}
		else
			System.out.println(n +  " is not a ArmStrong ");
		
		
	}
	
	static boolean arm(int n)
	{
		int sum=0; int temp=n;
		
		do {
			int d = n%10;
			sum = sum+d*d*d;
			n=n/10;
			
		}while(n!=0);
		
		
		return sum==temp;
		
		
	}
	

}
