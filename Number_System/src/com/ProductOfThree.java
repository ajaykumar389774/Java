package com;
import java.util.Scanner;
public class ProductOfThree {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		 
		 int rs =digits(n);
		
	}
	
	static int digits(int n)
	{
		int i=1;
		while(n>=i) {
			if(i%3==0)
			{
	            System.out.println(i);
			}
			i++;
		}
		
		return i;
		
	}

}
