package equals;


public class Car {

	double price;
	String name;
	
	Car(double price)
	{
		this.price=price;
	}
	Car(String name)
	{
		this.name=name;
	}
	
	
	@Override
	public boolean equals(Object obj) // it is used to store object of subclass // upcasting -->> Object obj=new Car
	{
		if(obj instanceof Car) // it is used compare with it is having car object or not
		{ 
			Car c = (Car)obj; // it is used to downcast 
			return this.name==c.name; // comparison logic which object calling we should want to use this(c1) and we should give downcasted reference for another object
		}                                // s1.price == s2.price
		return false;
		
	}
	
	
public static void main(String[] args) {
	
	Car c1 = new Car("Alto");
	Car c2 = new Car("Alto");
	System.out.println(c1.equals(c2));

	
}
	
	
	
	
	
	
	
	
}
