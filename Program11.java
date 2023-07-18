class Program11
{
	public static void sample()
	{
		System.out.println("sample method !!");
	}
		
	public static void demo()
	{
		System.out.println("demo method !!");
		sample();
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method !!");
		demo();
	}
}

	