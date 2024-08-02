package merge;
import java.util.Scanner;
public class PairOfElementSumEqualToN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int m = sc.nextInt();
		
		
	    ispair(arr,m);
		
	}
	
	static void ispair(int arr[] , int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==n)
				{
					System.out.println(arr[i] +"  " + arr[j] + " is the pair element of n");
					break;
				}
				
				
			}
		}
		
		
	}
	
}
