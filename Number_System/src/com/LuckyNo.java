package com;
import java.util.Scanner;
public class LuckyNo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("------print ");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		int rs = isdigit(dd)+isdigit(mm)+isdigit(yy);
		
		while(rs>=10) {
			int sum=isdigit(rs);
			rs=sum;
		}
		System.out.println(rs+ "It is lucky Number");
		
		
		
	}
	
	static int isdigit(int n)
	{
	
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}

}
