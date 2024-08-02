package twodimensionalarray;

public class PrimePresentInMatrix {
	public static void main(String[] args) {
		
		System.out.println("Enter The First Matrix :");
		
		int x[] [] = ReadDis.isread();
		
		System.out.println("User Entered Element : ");
		
		ReadDis.dis(x);
		
		int rs = isprime(x);
		
		System.out.println(rs);
		
		
		
	}
	
	static int isprime(int[][]x)
	{
		int pcount=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				boolean rs = isdis(x[i][j]);
				if(rs)
				{
					pcount++;
				}
			}
		}
		return pcount;
	}
	
	static boolean isdis(int n)
	{
		if(n==0||n==1)
		{
			return false;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
			
		}
		
		return true;
	}

}
