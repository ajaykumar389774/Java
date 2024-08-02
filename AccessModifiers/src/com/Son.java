package com;

import org.Father;

public class Son extends Father{
	//Accessing Protected member inside different package
	
	
	public static void main(String [] args)
	{
		Son s = new Son();
		System.out.println(s.name);
	}

}
