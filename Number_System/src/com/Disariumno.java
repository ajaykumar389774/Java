package com;
import java.util.Scanner;
public class Disariumno {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean rs=dno(n);
		
		if(rs)
		{
			System.out.println( n + " it is a Disariumno ");
		}
		else
			System.out.println(n + "  it not a disariumno");

	}
	
	static boolean dno(int n)
	{
		int temp=n;  int sum=0; int c=count(n);
		
		do {
			int d=n%10;
			sum=sum+pow(d,c);
			c--;
			n=n/10;
		}while(n!=0);
		
		return sum==temp;
	}
	
	static int count(int n)
	{
		int count=0;
		do {
			int r = n%10;
			count++;
			n=n/10;
			
		}while(n!=0);
		
		return count;
	}
	
	static int pow(int d,int c)
	{
		int pro=1;
		do {
			pro=pro*d;
			c--;
		}while(c>0);
		return pro;
	}

}
