class Demo
{
	Demo()
	{
		System.out.println("CONSTRUCTOR 1 ");	
	}

	Demo(int a )
	{
		System.out.println("CONSTRUCTOR 2 ");	
	}
	
	Demo(int a , double b)
	{
		System.out.println("CONSTRUCTOR 3 ");	
	}

	Demo(double a , int b)
	{
		System.out.println("CONSTRUCTOR 4 ");	
	}
}

class MainApp12
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo( 20.9 , 10 );
	}
}



















