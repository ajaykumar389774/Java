package equals;

public class Bus {
	
	int ticket;
	
	Bus(int ticket)
	{
		this.ticket=ticket;
	}
	
      public boolean equals(Object obj)
	{
    	  if(obj instanceof Bus)
    	  {
    		  Bus b = (Bus) obj;
    		  return this.ticket==b.ticket;
    	  }
    	 
    	  return false;
		
	}
	
	public static void main(String[] args) {
		
		Bus b1 = new Bus(24);
		Bus b2 = new Bus(23);
		
		System.out.println(b1.equals(b2));
		
		
	}

}
