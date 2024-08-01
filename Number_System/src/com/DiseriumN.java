package com;
import java.util.Scanner;
public class DiseriumN {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			boolean rs = isdis(i);
			if(rs)
			{
				System.out.println(i);
			}
		}
		
	}
	
	static boolean isdis(int i)
	{
		int sum=0;int ct=count(i); int t=i;
		do {
			int r=i%10;
			sum=sum+pow(r,ct);
			ct--;
			i=i/10;
		}while(i!=0);
		
		return sum==t;
		
	}
	
	
	static int count(int d)
	{
		int count=0;
		while(d>0)
		{
			int r=d%10;
			count++;
			d=d/10;
		}
		
		return count;
	}
	
	static int pow(int s,int ct)
	{
		int pro=1;
		
		while(ct>0)
		{
			pro=pro*s;
			ct--;
		}
		
		return pro;
	}

}
