package twodimensionalarray;
import java.util.Scanner;
public class DiagonalWiseSum {
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
		
	    int [] rs=issum(arr);
	    System.out.println(rs[0]);
	    System.out.println(rs[1]);
	    
		
		
		
	}
	
	static int [] issum(int [] [] x)
	{
		int psum=0; 
		int ssum=0;
		
		for(int i=0;i<x.length;i++)
		{
			psum=psum+x[i][i];
			ssum=ssum+x[i][x.length-1-i];
		}
		
		int [] rs= {psum,ssum};
		return rs;
	}
	

}
