package merge;

import java.util.Scanner;

public class DeleteArray {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i =0;i<arr.length;i++)//x={24,45,65,45,54}
		{
			arr[i] = sc.nextInt(); 
			
		} 
		
		
		int index=sc.nextInt();
		
		int [] res =issort(arr,index);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
		}
	
	static int [] issort(int [] x , int in)
	{
        if(in<0 || in>=x.length)
        {
        	System.out.println("it is out of range");
        	return x;
        }
        
        int z[] = new int[x.length-1];
        
        for(int i=0;i<z.length;i++)
        {
        	if(i<in)
        	{
        		z[i]=x[i];
        	}
        	else
        		z[i]=x[i+1];
        }
        
		return z;
		
	}
	}

