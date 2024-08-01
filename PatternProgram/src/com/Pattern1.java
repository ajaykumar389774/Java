package com;
import java.util.Scanner;
public class Pattern1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
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
        	 else
        	 {
        		 space++;
        		 star=star-2;
        	 }
        	 System.out.println();
         }
         

		
		
	}		
	}

