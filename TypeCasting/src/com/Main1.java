package com;

public class Main1 {
 
	public static void main(String [] args)
	{
		Car c = new Car();
		Vehicle v = c;
		v.details();
        System.out.println(v.brand);
        
        System.out.println("_____________________");
        
        
        Car c1 = (Car) v;
        c1.details();
        c1.details1();
        System.out.println(c1.brand + " " + c1.brand1);
        
		
	}
}
