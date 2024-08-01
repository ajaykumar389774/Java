package com;
import java.util.Scanner;
public class DivisorOfn {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rs =digits(n);
		
	}
	
	
	static int digits(int n)
	{
		int i=2;
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			
            i++;
		}
		return i;
	}

}
