package com;
import java.util.Scanner;
public class DigitPresent {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rs=present(n);
		System.out.println(n);
		System.out.println(rs);
		
	}
	
	static int present(int n)
	{
		int count=0;
		
		do {
			int d=n%10;
			count++;
			n=n/10;
			
		}while(n!=0);
		return count;
	}

}
