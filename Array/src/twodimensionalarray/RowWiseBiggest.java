package twodimensionalarray;
 
public class RowWiseBiggest {

	public static void main(String[] args) {
		
		System.out.println("Enter The First Matrix");
		
		int x [] [] = ReadDis.isread();
		
		System.out.println("User Entered Values");
		
		ReadDis.dis(x);
		
		int rs [] = isdig(x);
		for(int i=0;i<rs.length;i++)
		{
			System.out.println(rs[i]);
		}
		
	}
	
	static int[]isdig(int [] [] x)
	{
		int [] max = new int[x.length];
		
		for(int i=0;i<x.length;i++)
		{
			int big = Integer.MIN_VALUE;
			for(int j=0;j<x[i].length;j++)
			{
				if(x[i][j]>big)
				{
					big=x[i][j];
				}
				max[i]=big;

			}
		}
		return max;
	}
	
}
