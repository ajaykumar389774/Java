package com;
import java.util.Scanner;
public class StrongN {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			boolean rs = isstrong(i);
			if(rs)
			{
				System.out.println(i);
			}
		}
		
		
	}
	
	static boolean isstrong(int i)
	{
		int sum=0; int t=i;
		do{
			int d=i%10;
			sum=sum+fact(d);
			i=i/10;
		}while(i!=0);
		
		return sum==t;
	}
	
	static int fact(int x)
	{
		int fact=1;
		while(x>1)
		{
			fact=fact*x;
			x--;
		}
		return fact;
	}

}
