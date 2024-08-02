package org;

//Accessing public members in different package

import com.Car;//*By importing the package we can use public members

public class EmployeeMain1 {
	
	public static void main(String [] args) {
		
		System.out.println("Brand : " + Car.brand);
		
		Car c1 = new Car();
		System.out.println("Cost  :" + c1.cost);
	}

}
