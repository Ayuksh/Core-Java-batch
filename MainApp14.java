class Central
{
	String s1 = "INSTANCE VARIABLE !!";
	
	public void display()
	{
		String s1 = "LOCAL VARIABLE !!";
		//System.out.println( "THIS : "+ this );
		System.out.println( s1 );
		System.out.println( this.s1 );
	}
}

class MainApp14
{
	public static void main(String[] args)
	{
		Central c1 = new Central();
		System.out.println("C1 : "+ c1);
		c1.display();
		

		
	}
}