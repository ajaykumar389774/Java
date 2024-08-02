package twodimensionalarray;
import java.util.Scanner;
public class BiggestArrayMatrix {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		
		System.out.println("Enter the " + row*col + " Values");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("User Entered Element : ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			
			System.out.println();
		}
		
		int big = isbig(arr);
		System.out.println(big);
		
		
	}
	
	static int isbig(int x [] [])
	{
		int big=Integer.MIN_VALUE;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(x[i][j]>big)
				{
					big=x[i][j];
				}
			}
		}
		
		return big;
	}

}
