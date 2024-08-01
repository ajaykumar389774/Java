package com;
import java.util.Scanner;
public class DigitEvenOrOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e=even(n);
		int o=odd(n);
		
		System.out.println("The even digit present : " + e);
		System.out.println("The odd digit present : "  + o);
		
		
	}
	
	static int even(int n)
	{
		int count=0;
		do {
			int d=n%10;
			if(d%2==0)
			{
				count++;
			}
			n=n/10;
			
			
		}while(n!=0);
      return count++;
	}
	static int odd(int n)
	{
		int count1=0;
		do {
			int d=n%10;
			if(d%2==1)
			{
				count1++;
			}
			n=n/10;
			
			
		}while(n!=0);
      return count1++;
	}
}
