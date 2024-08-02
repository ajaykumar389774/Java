package twodimensionalarray;
import java.util.Scanner;
public class ReadDis {
	
	static int[] []  isread()  {
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		
		int col = sc.nextInt();
		
		int arr[][]=new int [row] [col];
		
		System.out.println("Enter the " + row*col + " Values");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		return arr;
	}
	
	
	static void dis(int [] [] arr)
	{		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
