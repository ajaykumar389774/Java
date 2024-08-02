package equals;

public class Student_1 {
	
	String name;
	int marks;
	
	Student_1(String name,int marks){
		
		this.name=name;
		this.marks=marks;
		
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Student_1)
		{
			Student_1 s =  (Student_1) obj;
		
			
			return this.marks==s.marks;
		}
		return false;
		
		
	}
	

}
