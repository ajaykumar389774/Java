package com;
import java.util.Scanner;
public class BtoD {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int bin=sc.nextInt();
		System.out.println(bintodec(bin));
		
	}
	
	static String bintodec(int bin)
	{
		String dec=""; int p=1;
		do {
			int d=bin%10;
			dec=dec+d*p;
			p=p*2;
			bin=bin/10;
		}while(bin!=0);
		
		return dec;
	}

}
