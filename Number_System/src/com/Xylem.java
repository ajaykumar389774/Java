package com;
import java.util.Scanner;
public class Xylem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String rs = isxylem(n);
		
		System.out.println(n + " it is a " + rs);
		
	}
	
	static String isxylem(int n)  //2546
	{
		int es=0; int ms=0;
		
		es=es+n%10; //0+2546%10 --- 6
		n=n/10;    // 2546/10 --- 254
		
		while(n>9){
			
			ms=ms+n%10;//0+254 --- 4   --- 4+5 --- 9 
			n=n/10;   //254/10 -- 25 --- 2
			
		}
		es=es+n;
		
		if(es==ms)
		{
			return "Xylem";
		}
		else
			return "Pholem";
	}

}
