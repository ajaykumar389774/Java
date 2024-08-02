package merge;

import java.util.Scanner;

public class SortedArray {
	
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
		
		int []z=merge(arr,ar);
		for (int i = 0; i < z.length; i++) {
			System.out.println(z[i]);
		}
		

		
		
	}
	
	static int [] merge(int [] x , int [] y)
	{
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length && j<y.length)
		{
			if(x[i]<y[j])
			z[k++]=x[i++];
			else
				z[k++]=y[j++];
		}
		
		while(i<x.length)
		{
			z[k++]=x[i++];
		}
		
		while(j<y.length)
		{
			z[k++]=y[j++];
		}
		
		return z;
	}

}
