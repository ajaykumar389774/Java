package com;

public class Main {

	public static void main(String [] args)
	{
		Son s = new Son(); 
		Father f = s;                       //Up casting
		System.out.println(f.name);
		
		//DownCasting
		
		Son s1 = (Son) f;
		System.out.println(s1.name + " " + s1.name1);
		
		
	}
	
}
