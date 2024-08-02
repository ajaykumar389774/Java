package merge;
import java.util.Scanner;
public class CommonArray {
	
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int m = sc.nextInt();
		
		int ar[] = new int[m];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		
		int [] rs = iscom(arr,ar);
		for(int i=0;i<rs.length;i++)
		{
			System.out.println(rs[i]);
		}
		
		
	}
	
	static int[] iscom(int x [] , int [] y)
	{
		int z[] = new int[x.length];
		
		int k=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					z[k++]=x[i];
				}
			}
		}
		
		int rs[] = new int[k];
		for(int i=0;i<rs.length;i++)
		{
			rs[i]=z[i];
		}
		
		return rs;
		
	}

}
