package twodimensionalarray;
import java.util.Scanner;
public class DiagonalWiseReverse {
	
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
		
		int [][]rs = isdiagoanlrev(arr);
		for(int i=0;i<rs.length;i++)
		{
			for(int j=0;j<rs.length;j++)
			{
				System.out.print(rs[i][j]+" ");
			}
			System.out.println();
		}
	
		
		
		
	}
	
	static int[][] isdiagoanlrev(int [] [] x)
	{
		int first=0; int last=x.length-1;
		
		while(first<last)
		{
			int temp=x[first][first];
			x[first][first]=x[last][last];
			x[last][last]=temp;
			
			int tem=x[first][last];
			x[first][last]=x[last][first];
			x[last][first]=temp;
			
			first++;
			last--;
		}
		return x;
	}

}
