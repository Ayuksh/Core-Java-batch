import java.util.Scanner ;

class Circle
{
	public  void circumference( int r )
	{	
		double cir = 2 * 3.14 * r ;
		System.out.println("CIRCUMFERENCE OF CIRCLE IS "+ cir );
	}
	
	public static void area( int r )
	{
		double a = 3.14 * r*r ;
		System.out.println("AREA OF CIRCLE IS "+ a);
	}
} 

class MainApp3
{
	public static void main(String[] args)
	{
		System.out.println("ENTRE RADIUS ");
		int r = new Scanner(System.in).nextInt();

		System.out.println("CHOOSE THE OPTION  ");
		System.out.println("1. AREA ");
		System.out.println("2. CIRCUMFERENCE ");
		int ch = new Scanner(System.in).nextInt();

		if(ch == 1)
			Circle.area( r );
		else if( ch == 2 )
			new Circle().circumference( r );
		else
			System.out.println("INVALID OPTION !!");
	}
}		





















