package twodimensionalarray;

public class SumOfEvenOrOdd {
	
	public static void main(String[] args) {
		
		System.out.println("First Matrix Element :");
		
		int x[] [] = ReadDis.isread();
		
		System.out.println("User Entered Element :");
		
		ReadDis.dis(x);
		
		int rs[] = sumofeo(x);
		System.out.println("Sum of Even Number : " + rs[0]);
		System.out.println("Sum of Odd Number : " + rs[1]);
		
		
	}
	
	static int[] sumofeo(int [] [] x)
	{
		int esum=0;
		int osum=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(x[i][j]%2==0)
				{
					esum=esum+x[i][j];
				}
				else
				{
					osum=osum+x[i][j];
				}
			}
		}
		
		int sum[]= {esum,osum};
		
		return sum;
		
	}

}
