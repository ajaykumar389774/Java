package com;
import java.util.Scanner;
public class OnePresent {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rs=one(n);
		System.out.println( n+"  One Present in the Number :  " + rs);
		
	}
	
	static int one(int n )
	{
		int count=0;
		do {
			int d =n%10;
			if(d==1)
			{
				count++;
			}
			n=n/10;
		}while(n!=0);
		return count;
	}

}
