package merge;

import java.util.Scanner;

public class InsertArray {
	
	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n = sc.nextInt();
	int arr[] = new int[n];

	for(int i =0;i<arr.length;i++)//x={24,45,65,45,54}
	{
		arr[i] = sc.nextInt(); 
		
	} 
	
	int ele = sc.nextInt();
	
	int index=sc.nextInt();
	
	int [] res =issort(arr,ele,index);
	for(int i=0;i<res.length;i++)
	{
		System.out.println(res[i]);
	}
	
	}
	
	static int[] issort(int [] x,int ele,int in)
	{
		int [] z = new int[x.length+1];
		z[in]=ele;
		
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
			{
				z[i]=x[i];
			}
			else
			{
				z[i+1]=x[i];
			}
			
		}
		
		return z;
		
		
	}
	
}
