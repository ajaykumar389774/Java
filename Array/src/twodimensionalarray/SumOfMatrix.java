package twodimensionalarray;
import java.util.Scanner;
public class SumOfMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int arr[][]=new int [row][col];
		
		System.out.println("Enter the " + row*col + " values : ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Entered Matrix");
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i] [j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("_________________________________");
		int x = sumofarray(arr);
		System.out.println("Sum of Array Matrix : " + x);
	}
	
	
	
	static int sumofarray(int x [] [])
	{
		int sum=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				sum=sum+x[i][j];
			}
			
		}
		
		return sum;
		
	}

}
