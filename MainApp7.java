import java.util.Scanner ;

class Laptop
{
	String companyName ;
	double price ;
	String color ;
	int ram ;
	
	public void init(String n , double p , String c , int r )
	{
		companyName = n ;
		price = p ;
		color = c ;
		ram = r;
	}
		
	public void display()
	{
		System.out.println("---------------------------");
		System.out.println("COMPANY NAME :"+ companyName );
		System.out.println("PRICE        :"+ price );
		System.out.println("COLOR        :"+ color );
		System.out.println("RAM          :"+ ram );
		
	}

}

class MainApp7
{
	static Scanner sc = new Scanner(System.in);
		
	public static Laptop getLaptop()
	{
		Laptop laptop = new Laptop();
		System.out.println("ENTER COMPANY NAME ");
		String n = sc.next();
		System.out.println("ENTER PRICE  ");
		double p = sc.nextDouble();
		System.out.println("ENTER LAPTOP COLOR ");
		String c = sc.next();
		System.out.println("ENTER LAPTOP RAM ");
		int r = sc.nextInt();
			
		laptop.init( n , p , c , r );
		return laptop ;
	}

	public static void main(String[] args)
	{
		Laptop l1 = getLaptop();
		Laptop l2 = getLaptop();
		
		l1.display();
		l2.display();
		l1.display();
		
	}
}
		




































