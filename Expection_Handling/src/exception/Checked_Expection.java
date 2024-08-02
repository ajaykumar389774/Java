package exception;
import java.io.*;
public class Checked_Expection {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread expection");
			}
		}
          
		
		try {
		FileReader f = new FileReader("Car.txt");
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File not Found Expection");
		}
		
	}
	

}
