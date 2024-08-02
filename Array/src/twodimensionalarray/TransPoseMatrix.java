package twodimensionalarray;
import java.util.Scanner;
public class TransPoseMatrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int arr[] [] = new int [row][col];
		
		System.out.println("Enter the " + row*col + "Values");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("User Entered Element");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int [] [] rs=istra(arr);
		
		for(int i=0;i<rs.length;i++)
		{
			for(int j=0;j<rs.length;j++)
			{
				System.out.print(rs[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	static int[][] istra(int [][]x)
	{
       int[] [] trans=new int[x[0].length][x.length];
       
       for(int i=0;i<x.length;i++)
       {
    	   for(int j=0;j<x.length;j++)
    	   {
    		   trans[j][i]=x[i][j];
    	   }
       }
		
		return trans;
	}
	
}
