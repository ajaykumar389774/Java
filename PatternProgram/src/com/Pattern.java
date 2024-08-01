package com;
import java.util.Scanner;
public class Pattern {
	
	public static void main(String[] args) {
		
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  pattern4(n);
	  
	  }
	
	
	static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			
		}
	}

	
	
	static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			
		}
	}
	
	static void pattern2(int n)
	{
		for(int i=1;i<=n;i++) //1 //2 //3
		{
			for(int j=1;j<=n-i+1;j++) //1<=5-1+1=1<=5 // 5-2+1
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			
		}
	}
	
	static void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + "  ");
			}
			
			System.out.println();
			
			
		}
	}
	
	static void pattern4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			
		}
	}


		 
	}


