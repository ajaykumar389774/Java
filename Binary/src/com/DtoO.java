package com;
import java.util.Scanner;
public class DtoO {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dec = sc.nextInt();
		
		System.out.println(dectooctal(dec));
		
	}
	
	static String dectooctal(int dec)
	{
		String oct="";
		do {
			int d=dec%8;
			oct=oct+d;
			dec=dec/8;
		}while(dec!=0);
		
		return oct;
	}

}
