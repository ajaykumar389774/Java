package equals;
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int s = sc.nextInt();
	
	Student_1 s1 = new Student_1("Tom",n);
	
	Student_1 s2 = new Student_1("Jerry",s);
	
	if(s1.equals(s2)==true)
	{
		System.out.println(s1.name + "  &" + s2.name + "  have scored same Marks");
		
	}
	else
	{
		System.out.println(s1.name + "  & " + s2.name + " have scored different marks");
	}

	
	
}
}
