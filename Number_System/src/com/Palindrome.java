package com;
import java.util.Scanner;
public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean rs=pdrome(n);
		
		if(rs)
		{
			System.out.println( n + "  it is Palindrome");
		}
		else
			System.out.println(n + "  it is not Palindrome");
	}
	
	
	static boolean pdrome(int n)
	{
		int rev=0,temp=n;
		
		do {
			int d = n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n!=0);
		
		return rev==temp;
		
	}

}
