package all;

public class Main {
	
	static void calling(Father obj)  // Father obj = new Son();
	{
		if(obj instanceof Son)
		{
			System.out.println("DownCasting Son");
			Son s = (Son) obj;
			System.out.println("age :" + s.age + " age1 : " + s.age1);
			s.details();
			s.details1();
		}
		
		else if(obj instanceof Daughter)
			{
			System.out.println("DownCasting Daughter");
			Daughter d = (Daughter) obj;
			System.out.println("age : " + d.age + " age2 : " + d.age2 );
			
			
			}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Main.calling(new Son());
		
		System.out.println("_______________________________________");
		
		Main.calling(new Daughter());
		
	}

}
