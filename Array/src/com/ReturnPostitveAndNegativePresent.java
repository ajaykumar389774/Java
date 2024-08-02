package com;
import java.util.Scanner;
public class ReturnPostitveAndNegativePresent {

    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println("Enter the size of the array");
    	int n = sc.nextInt();
    	
    	int arr[]= new int[n];
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	
    	int[] res=isdigit(arr);
    	System.out.println(res[0]);
    	System.out.println(res[1]);
    	
    	
	}
    
    static int[] isdigit(int [] x)
    {
    	int p=0;
    	int n=0;
    	
    	for(int i=0;i<x.length;i++)
    	{
    		if(x[i]>=0)
    		{
    			p++;
    		}
    		else
    		{
    			n++;
    		}
    	}
    	
    	int count[]= {p,n};
    	
    	return count;
    	
    	
    }
	
	
}
