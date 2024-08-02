package twodimensionalarray;

public class EvenOddPresentInMatrix {
	
	public static void main(String[] args) {
		
		System.out.println("Enter The First Matrix : ");
		
		int x[][] = ReadDis.isread();
		
		System.out.println("User Entered Element");
		
		ReadDis.dis(x);
		
		int [] rs = iseven(x);
		System.out.println("Count of even present : " + rs[0]);
		System.out.println("Count of odd present : " + rs[1]);
		
		
		
	}
	
	static int[] iseven(int [] [] x)
	{
		int ecount=0;
		int ocount=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				if(x[i][j]%2==0)
				{
					ecount++;
				}
				else
				{
					ocount++;
				}
			}
		}
		
		int count[]= {ecount,ocount};
		
		return count;
	}

}
