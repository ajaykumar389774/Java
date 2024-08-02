package twodimensionalarray;
import java.util.Scanner;
public class ColumnWiseBiggest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		
		System.out.println("Enter The " + row*col + " Values");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("User Entered Values : ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		int [] rs=issmall(arr);
		for(int i=0;i<rs.length;i++)
		{
			System.out.println(rs[i]);
		}
		
	}
	
	static int[]isbig(int [] [] x)
	{
		int [] max = new int[x.length];
		
		for(int i=0;i<x.length;i++)
		{
			int big = Integer.MIN_VALUE;
			for(int j=0;j<x[i].length;j++)
			{
				if(x[j][i]>big)
				{
					big=x[j][i];
				}
				max[i]=big;

			}
		}
		return max;
	}
	
	
	
	static int[]issmall(int [] [] x)
	{
		int [] min = new int[x.length];
		
		for(int i=0;i<x.length;i++)
		{
			int big = Integer.MAX_VALUE;
			for(int j=0;j<x[i].length;j++)
			{
				if(x[j][i]<big)
				{
					big=x[j][i];
				}
				min[i]=big;

			}
		}
		return min;
	}
	
	
	
	
	
	/*static void isdig(int [] []x,int col)
	{
		for(int i=0;i<col;i++)
		{
			int max=x[0][i];
			for(int j=0;j<x[i].length;j++)
			{
				if(x[j][i]>max)
				{
					max=x[j][i];
				}
			}
			System.out.println(max);
		}
	}*/
}