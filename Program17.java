import java.util.Scanner ;

class Program17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER VALUE ");
		int a =	sc.nextInt();
		
		System.out.println("ENTER VALUE AGAIN ");
		int b = sc.nextInt();	

		int c = a+b ;	

		System.out.println("A value is "+ a);
		System.out.println("B value is "+ b);
		System.out.println("SUM OF A & B "+ c);
		
	}
}