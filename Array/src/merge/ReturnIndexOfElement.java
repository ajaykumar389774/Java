package merge;
import java.util.Scanner;
public class ReturnIndexOfElement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int ele=sc.nextInt();
		
		int rs = issearch(arr,ele);
		System.out.println(rs);
		
	}
	
	static int issearch(int x[] , int ele)
	{
	    for(int i=0;i<x.length;i++)
	    {
	    	if(x[i]==ele)
	    	{
	    		return i;
	    	}
	    }
		return -1;
	}

}
