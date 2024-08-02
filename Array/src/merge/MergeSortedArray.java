package merge;
import java.util.Scanner;
public class MergeSortedArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		int arr[] = new int[m];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int n = sc.nextInt();
		
		int ar[]=new int[n];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
	
		int [] rs= isdigit(arr,ar,m,n);
		
		for(int i=0;i<rs.length;i++)
		{
			System.out.println(rs[i]);
		}
		
	}
	
	static int[] isdigit(int [] x ,int [] y, int n , int m)
	{
		int p1=m-1;
		int p2 = n-1;
		int i=m+n-1;
		
		while(p2>=0)
		{
			if(p1>=0 && x[p1]>x[p2])
			{
				x[i--]=x[p1--];
			}
			else
			{
				x[i--]=y[p2--];
			}
		}
		
		int [] count= {p1,p2};
		
		return count;
	}
}
