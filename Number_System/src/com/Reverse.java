package com;
import java.util.Scanner;
public class Reverse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rs=reverse(n);
		
		System.out.println(n + "    is reversed to "  + rs );
		
	}
	
	static int reverse(int n)
	{
		int rev=0; int temp=n;
		
		do {
			
			int d =n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n!=0);
		
		return rev;
	}

}
