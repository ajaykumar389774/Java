package merge;
import java.util.Scanner;
public class ReplaceEveryElementSumOfDigits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int rs[] = issum(arr);
		for(int i=0;i<rs.length;i++)
		{
			System.out.println(rs[i]);
		}
		
		
		
	}
	
	static int [] issum(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			x[i]=isdigit(x[i]);
		}
		
		return x;
	}
	
	static int  isdigit(int x)
	{   int sum=0;
		while(x!=0)
		{
			int d =x%10;
			sum=sum+d;
			x=x/10;
		}
		
		return sum;
	}
	
	

}
