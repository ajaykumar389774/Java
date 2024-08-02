package equals;

public class Employee {
	
	int id;
	double salary;
	
	Employee(int id , double salary)
	{
		this.id=id;
		this.salary=salary;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Employee)
		{
			Employee e = (Employee) obj;
			
			return this.id==e.id && this.salary==e.salary;
			
		}
		return false;
		
	}

}
