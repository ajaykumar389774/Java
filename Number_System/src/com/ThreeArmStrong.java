package com;
import java.util.Scanner;
public class ThreeArmStrong {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=100;i<=n;i++)
		{
			boolean rs = isarm(i);
			if(rs)
			{
				System.out.println(i);
			}
		}
		
	}
	
	static boolean isarm(int i)
	{
		int sum=0; int temp=i;
		do {
			int d =i%10;
			sum=sum+d*d*d;
			i=i/10;
		}while(i!=0);
		
		return sum==temp;
	}

}
