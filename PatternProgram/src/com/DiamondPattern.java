package com;
import java.util.Scanner;
public class DiamondPattern {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		p1(n);
		System.out.println("_________________________________");
		p2(n);
		System.out.println("_________________________________");
		p3(n);
		System.out.println("_________________________________");
        p4(n);
		System.out.println("_________________________________");
        p5(n);
		System.out.println("_________________________________");
        p6(n);
		System.out.println("_________________________________");
		p7(n);
		System.out.println("_________________________________");
        p8(n);
		
		
	}
	
	static void p1(int n)
	{
		int space=n/2;
		int star=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			
			if(i<=n/2)
			{
				space--;
				star=star+2;
			}
			else
			{
				space++;
				star=star-2;
			}
				System.out.println();
		}	
	}
	
	static void p2(int n)
	{
		int space=0;
		int star=n;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			if(i<=n/2)
			{
				space++;
				star=star-2;
			}
			else {
				space--;
			star=star+2;
			}
			System.out.println();
		}
		
	}
	
	
	static void p3(int n)
	{
		int space=0;
		int star=n;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print(j%2+" ");
			}
			if(i<=n/2)
			{
				space++;
				star=star-2;
			}
			else {
				space--;
			star=star+2;
			}
			System.out.println();
		}
		
	}
	
	
	

	static void p4(int n)
	{
		int space=0;
		int star=n;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			int x=space+1;
			for(int j=1;j<=star;j++)
			{
				System.out.print(x+" ");
				
				if(j<=star/2)
					x++;
				else
					x--;
			}
			if(i<=n/2)
			{
				space++;
				star=star-2;
			}
			else {
				space--;
			star=star+2;
			}
			System.out.println();
		}
		
	}
	
	
	static void p5(int n)
	{
		int space=0;
		int star=n;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			int x=star/2+1;
			for(int j=1;j<=star;j++)
			{
				System.out.print(x+" ");
				
				if(j<=star/2)
					x--;
				else
					x++;
			}
			if(i<=n/2)
			{
				space++;
				star=star-2;
			}
			else {
				space--;
			star=star+2;
			}
			System.out.println();
		}
		
	}
	
	
	static void p6(int n)
	{
		int space=n/2;
		int star=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			int x=star/2+1;
			for(int j=1;j<=star;j++)
			{
				System.out.print(x+" ");
				
				if(j<=star/2)
					x--;
				else
					x++;
			}
			if(i<=n/2)
			{
				space--;
				star=star+2;
			}
			else {
				space++;
			star=star-2;
			}
			System.out.println();
		}
		
	}
	
	
	static void p7(int n)
	{
		int space=n/2;
		int star=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			int x=space+1;
			for(int j=1;j<=star;j++)
			{
				System.out.print(x+" ");
				
				if(j<=star/2)
					x++;
				else
					x--;
			}
			if(i<=n/2)
			{
				space--;
				star=star+2;
			}
			else {
				space++;
			star=star-2;
			}
			System.out.println();
		}
		
	}
	
	
	static void p8(int n)
	{
		int space=n/2;
		int star=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=star;j++)
			{
				if(j==1||j==star)
				System.out.print("*  ");
				else
					System.out.print("  ");
			}
			if(i<=n/2)
			{
				space--;
				star=star+2;
			}
			else {
				space++;
			star=star-2;
			}
			System.out.println();
		}
		
	}
	
	
	
	
	

}
