package com;
import java.util.Scanner;
public class MultipleOf3N {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int rs=ismul(n);
		
	}
	
	
	static int ismul(int n)
	{
		int i=3; int sum=0;
		while(i<=n)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
			i++;
		}
			
		return i;	
		
	}

}
