package com;
import java.util.Scanner;
public class ReturnDiseriumNoPresent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int x = sc.nextInt();
		
		int arr[]=new int[x];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int rs = isdigit(arr);
		
		System.out.println(rs);
		
		
	}
	
	static int isdigit(int [] x)
	{
		int count=0;
		
		for(int i=0;i<x.length;i++)
		{
			boolean rs=isdis(x[i]);
			if(rs)
			{
				count++;
			}
			
		}
		
      return count;		
		
	}
	
	static boolean isdis(int n)
	{
		int temp=n;
		int ct=iscount(n);
		int sum=0;
		do {
			int d=n%10;
			sum=sum+pow(d,ct);
			ct--;
			n=n/10;
		}while(n!=0);
		
		return sum==temp;
	}
	
	static int iscount(int n)
	{
		int count=0;
		do {
			count++;
			n=n/10;
			
		}while(n!=0);
		
		return count;
	}
	
	static int pow(int d,int ct)
	{
		int pow=1;
		do {
			pow=pow*d;
			ct--;
			
			
		}while(ct>0);
		
		return pow;
	}
	
}
