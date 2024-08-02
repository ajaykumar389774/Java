package twodimensionalarray;

public class SumOfColumnWise {

	public static void main(String[] args) {
		
		System.out.println("Enter the first matrix");
		
		int x [] [] = ReadDis.isread();
		
		System.out.println("User Entered Values");
		
		ReadDis.dis(x);
		
		int rs = sum(x);
		System.out.println(rs);
		
	}
	
	static int sum(int [][] x)
	{
		int sum=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				sum=sum+x[j][i];
			}
		}
		return sum;
		
		
	}
}
