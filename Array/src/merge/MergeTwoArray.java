package merge;
import java.util.Scanner;
public class MergeTwoArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i =0;i<arr.length;i++)//x={24,45,65,45,54}
		{
			arr[i] = sc.nextInt(); 
			
		} 
		System.out.println("Enter the size of the array");//3
		
		int m = sc.nextInt();
		
		int ar[] = new int[m]; 
		
		for(int i=0;i<ar.length;i++) // y={45,65,45}
		{
			ar[i]=sc.nextInt();
		}
		
		int []z=merge(arr,ar);
		for (int i = 0; i < z.length; i++) {
			System.out.println(z[i]);
		}
		
		
		
		
	}
	
	static int [] merge(int [] x , int [] y)
	{
		int [] z=new int[x.length + y.length]; //z={24,45,65,45,54}
		
		for(int i=0;i<x.length;i++) //0 //0<5 //1<5 // 2<5 // 3<5 // 4<5
		{
			z[i] = x[i];
		}
		for(int i=0;i<y.length;i++) // i=0 0<3 1<3 2<3
		{
			z[x.length+i]=y[i]; //z={24,45,65,45,54,34,24,25}
		}
		
		return z;
	}
	
}
