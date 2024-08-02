
package com;
import java.util.Scanner;
public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		try{
			int z = n/m;

		System.out.println(z);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("0 can not be divided ");
		}
		
		System.out.println("END");
		
		
	}

}
