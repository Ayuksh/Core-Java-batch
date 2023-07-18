class Program29
{	
	static int a = 100 ;	//data member (static)

	public static void display()	//function member (static)
	{	
	
		System.out.println("THIS IS DISPLAY METHOD 1 !!");
	}
}

class Program30
{	
	static int a = 200 ;	//data member (static)

	public static void display()	//function member (static)
	{	
	
		System.out.println("THIS IS DISPLAY METHOD 2 !!");
	}
}

class MainApp1
{
	public static void main(String[] args)
	{
		System.out.println("THIS IS MAIN METHOD !!");
		Program30.display();
		System.out.println("A : "+ Program30.a);
		
	}
}