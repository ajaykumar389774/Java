//1. WAJP to check Whether the given number is Strong number or not
package com;
import java.util.Scanner;
public class StrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//145
		boolean s = isstrong(n);
		if(s)
		{
			System.out.println(n +" is a Strong Number");
		}
		else
			System.out.println(n + " is not a Strong number");
		
	}
	
	static boolean isstrong(int n)//145
	{
		int sum=0; int temp=n;
		do {
			int d = n%10;   //145 --- 5  // 14 --- -4  
			sum=sum+fact(d); // 0 + 120 // 120 + 24 // 144 + 1 ---- 145
	        n=n/10; // 145/10 --14
		}while(n!=0); //14!=0
		
		return sum==temp;
		
	}
	
	static int fact(int d) //5
	{
		int fc=1; //1  
		while(d>1)  // 5>1  // 4>1  // 3>1  // 2>1 //1>1 -- False 
		{
			fc=fc*d; // 1*5  // 5*4 // 20*3 // 60*2 // 120
			d--;  //4  // 3 // 2 // 1
		}
		return fc;
	}
}
