package com;
import java.util.Scanner;
public class OtoD {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int oct = sc.nextInt();
		
		System.out.println(octodec(oct));
		
		
	}
	
	static int octodec(int oct)
	{
		int dec=0; int p=1;
		
		do {
			int d=oct%10;
			dec=dec+d*p;
			p=p*8;
			oct=oct/10;
		
		}while(oct!=0);
		
		return oct;
	}

}
