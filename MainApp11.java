import java.util.Scanner ;

class Laptop
{
	String companyName ;
	String color ;
	double price ;
	int ram ;

	Laptop( String cn , String c , double p , int r )
	{
		companyName = cn ;
		color = c;
		price = p ;
		ram = r ;
	}

	public void displayDetails()
	{
		System.out.println("COMPANY NAME "+ companyName );
		System.out.println("COLOR "+ color );
		System.out.println("PRICE "+ price );
		System.out.println("RAM "+ ram );
	}
}	

class MainApp11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER COMPANY NAME ");
		String cn = sc.next();
		System.out.println("ENTER COLOR ");
		String c = sc.next();
		System.out.println("ENTER PRICE ");
		double p = sc.nextDouble();
		System.out.println("ENTER RAM ");
		int r = sc.nextInt();

		Laptop l1  = new Laptop(cn , c , p , r );	
		l1.displayDetails();

	}
}






















