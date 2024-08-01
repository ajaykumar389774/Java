package com;
import java.util.Scanner;
public class HappyNoN {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			boolean rs=ishappy(i);
			if(rs)
			{
				System.out.println(i);
			}
		}
	}
	
	static boolean ishappy(int i)
	{
		while(i>9)
		{
			int sum=0;
			do {
				int d = i%10;
				sum=sum+d*d;
				i=i/10;
			}while(i!=0);
			i=sum;
			
		}
		return i==1 || i==7;
	}

}
