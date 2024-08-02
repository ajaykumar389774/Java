package equals;
import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		double m = sc.nextDouble();
		
		int x=sc.nextInt();
		double y =sc.nextDouble();
		
		Employee e1 = new Employee(n,m);
		
		Employee e2 = new Employee(x,y);
		
		if(e1.equals(e2)==true)
		{
			System.out.println(e1.id + " & " + e1.salary + " are same"  );
		}
		
		else
		{
			System.out.println("id & salary are different");
		}
		
	}

}
