package com;
import java.util.Scanner;
public class ProductOfDigit {
	
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   
	   int n = sc.nextInt();
	   
	   int rs=digits(n);
	   
	   System.out.println(n + "   Product of Digit   " + rs);
}
   
   
   static int digits(int n)
   {
	   int temp=n;
	   int pro=1;
	   do {
		   int d=temp%10;
		   pro=pro*d;
		   temp=temp/10;
	   }while(temp!=0);
	   
	   return pro;
   }

}
