package com;

public class Student {
	//Accessing public members inside the same class
	
	public static String name="jhon";
    public int age=22;
    
    public static void main(String [] args)
    {
  	  System.out.println("Name : " + name);
  	  
  	  
  	  Student sc = new Student();
  	  System.out.println("Age : " + sc.age);
    }

}
