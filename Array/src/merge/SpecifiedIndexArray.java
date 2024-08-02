package merge;

import java.util.Scanner;

public class SpecifiedIndexArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i =0;i<arr.length;i++)//x={24,45,65,45,54}
		{
			arr[i] = sc.nextInt(); 
			
		} 
		System.out.println("Enter the size of the array");//3
		
		int m = sc.nextInt();
		
		int ar[] = new int[m]; 
		
		for(int i=0;i<ar.length;i++) // y={45,65,45}
		{
			ar[i]=sc.nextInt();
		}
		int in =sc.nextInt();
		
		int []z=merge(arr,ar,in);
		for (int i = 0; i < z.length; i++) {
			System.out.println(z[i]);
		}
		
		
		
	}
	
	static int[] merge(int [] x , int [] y,int in)
	{
		if(in<0 || in>x.length)
		{
			System.out.println("Out of range");
			return x;
		}
		int z[]=new int[x.length+y.length];

		for(int i=0;i<y.length;i++)
		{
			z[in+i]=y[i];
		}
		
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
			{
				z[i]=x[i];
			}
			else
				z[y.length+i]=x[i];
		}
		
		return z;
		
	}

}
