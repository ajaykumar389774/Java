package all;

class Father {
	
	int age = 56;
	
	void details()
	{
		System.out.println("Father has special power");
	}
	
}

class Son extends Father
{
	
	int age1 = 19;
	
	
	void details1()
	{
		System.out.println("Son acquired power from father");
	}
}

class Daughter extends Father
{
	int age2 = 15;
}
