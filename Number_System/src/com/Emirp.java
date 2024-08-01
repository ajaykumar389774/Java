package com;
import java.util.Scanner;
public class Emirp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean rs = isemirp(n);
		
		if(rs)
		{
			System.out.println(n+ "   is a emirp  ");
		}
		
		else
		{
			System.out.println(n + "  is not a emirp ");
		}
				
		
	}
	
	static boolean isemirp(int n)
	{
		int rev=reverse(n);
		for(int i=2;i<=rev/2;i++)
		{
			if(rev%i==0)
			{
				return false;
			}
			
		}
		return true;
		
	}
	
	static int reverse(int r)
	{
		int rev=0;
		do {
			int d=r%10;
			rev=rev*10+d;
			r=r/10;
		}while(r!=0);
		
		return rev;
	}
	
	

}
