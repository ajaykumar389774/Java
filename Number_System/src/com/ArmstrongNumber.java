package com;
import java.util.Scanner;
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //1245
		boolean rs=Anumber(a);
		
		if(rs)
		{
			System.out.println(a + "  is a Armstrong Number ");
		}
		else
			System.out.println(a + " is not a Armstrong Number");
		
	}
	
	static boolean Anumber(int a)
	{
		int temp=a;
		int ct=count(a);
		int sum=0;
		do {
			int d=a%10;//1254
			sum=sum+pow(d,ct);
			a=a/10;
			
		}while(a!=0);
		
		return sum==temp;
	}
	
	static int pow(int d, int a)
	{
		int pro=1;
		while(a>0) {
		  pro=pro*d;	
		  a--;
     }
		return pro;
	}
	
	static int count(int n) //1254
	{
		int count=0;
		while(n!=0) 
		{
			int r = n%10; //1254 --- 4 --- 12----5 --- 2 --- 
			count++; //1 // 2 // 3 // 4 
			n=n/10;//1254/10 -- 125 125/10 --- 12 12/10 ---- 1
		}
		return count;
		
	}
	

}
