class Program31
{
	static int a ;		// class variable
	boolean b ;		// instance variable

	public static void main(String[] args)
	{
		System.out.println("CLASS VARIABLE "+ a);
		System.out.println("INSTANCE VARIABLE "+  new Program31().b);
		int c = 30 ;	// local variable 
		System.out.println("LOCAL VARIABLE "+ c );
	}
}
