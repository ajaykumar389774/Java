package com;
import java.util.Scanner;
public class Multiplication {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int rs = digits(n);
		
		
	}
	
	
	static int digits(int n)
	{
		int mul=0;
		int i=1;
		while(i<=10)
		{
			mul=n*i;
			System.out.println(n + "  * " + i + " = " + mul);

			i++;

		}
		
		
		return mul;
	}

}
