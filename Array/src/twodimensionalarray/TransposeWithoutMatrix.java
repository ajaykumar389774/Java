package twodimensionalarray;
import java.util.Scanner;
public class TransposeWithoutMatrix {
	
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
	
	
	static int [] [] istra(int [] [] x)
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				int temp=x[i][j];
				x[i][j]=x[j][i];
				x[j][i]=temp;
			}
		}
		return x;
	}

}
