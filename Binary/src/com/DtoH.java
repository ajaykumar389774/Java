package com;
import java.util.Scanner;
public class DtoH {
	
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
			else if(d==10)
				hex='A'+hex;
			else if(d==11)
				hex='B'+hex;
			else if(d==12)
				hex='C'+hex;
			else if(d==13)
				hex='D'+hex;
			else if(d==14)
				hex='E'+hex;
			else if(d==15)
				hex='F'+hex;
			dec=dec/16;
		}while(dec!=0);
		
		return hex;
		
		
	}

}
