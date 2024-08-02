package merge;
import java.util.Scanner;
public class removeDuplicates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int r[] =duplic(arr);
		for(int i=0;i<r.length;i++)
		{
		System.out.println(r[i]);
		}
	}
	
	static int[] duplic(int arr[])
	{
		int z [] = new int[arr.length];
		int n=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{	
			z[n]=arr[i];
			n++;
		}}
		
		return z;
	}
	
}
