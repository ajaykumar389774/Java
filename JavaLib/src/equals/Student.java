package equals;

public class Student {
	
	int age;
	
	Student(int age)
	{
		this.age=age;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(21);
		Student s2 = new Student(21);  
		
		System.out.println(s1.equals(s2));  // it is used to compare the address of the object
		System.out.println(s2.equals(s1));
	}

}
