package com;
import java.util.Scanner;
public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i =0 ;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		try {
		System.out.println(arr[69]);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of range");
		}
		
		System.out.println("End");
		
		
		
	}
	
}
