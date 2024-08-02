package com;
import java.util.Scanner;
public class DtoB {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dec = sc.nextInt();
		
		System.out.println(dectobin(dec));
		
		
	}
	
	static String dectobin(int dec)
	{
		String bin="";
		do {
			
			int d=dec%2;
			bin=bin+d;
			dec=dec/2;
		}while(dec!=0);
		
		return bin;
	}

}
