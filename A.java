class Sample15

{
	Sample15()
	{
       System.out.println("Abra ka Dabra");
	}

	Sample15(int a)
	{
		this();
		 System.out.println("From Sample1(int a)");
	}


	
	
	
	public static void main(String[] args) 
	{
		 System.out.println("The Main Starts...");
	       Sample15 rv=new Sample15(2);
		    System.out.println("The Main ends...");

	}
		
}
