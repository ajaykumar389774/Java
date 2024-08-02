package com;
import java.util.Scanner;
public class DtoHusingAcsii {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dec = sc.nextInt();
		
		System.out.println(dectohex(dec));
		
	}
	
	static String dectohex(int dec)
	{
		String hex="";
		
		do {
			int d=dec%16;
			if(d<10)
				hex=hex+d;
			else
				hex=(char)(d+65)+hex;
			dec=dec/16;
			
		}while(dec!=0);
		
		return hex;
	}
	
}
