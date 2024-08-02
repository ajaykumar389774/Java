package throwable;
import java.util.Scanner;
public class Throwable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m =sc.nextInt();
		
		try {
		System.out.println(n/m); // throw new ArithmeticException("/ by Zero);
		}
		
		catch(Exception e)//Exception e = new ArithmeticException("/ by Zero);
		{
			e.printStackTrace();//java.lang.ArithmeticException: / by zero
			//at Expection_Handling/throwable.Throwable.main(Throwable.java:14)
		
			System.out.println(e.getMessage());/// by zero
			//System.out.println(e.printStackTrace());
		}
		
		System.out.println("Praveen");
		
	}

}
