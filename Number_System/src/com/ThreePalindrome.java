package com;
import java.util.Scanner;
public class ThreePalindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=100;i<=n;i++)
		{
			boolean rs=ispal(i);
			if(rs)
			{
				System.out.println(i);
			}
		}
	}
	
	static boolean ispal(int i )
	{
		int rev=0; int temp=i;
		
		do {
			int d=i%10;
			rev=rev*10+d;
			i=i/10;
		}while(i!=0);
		
		return rev==temp;
	}

}
