import java.util.Scanner;

class Program23
{
	public static double bonus(int yos , double salary)
	{	
		if(yos > 5)
		{
			double increment = salary * 0.05  ;
			return salary + increment ;
		}else{
			return salary ;
		}
	}
		
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER YEAR OF SERVICE ");
		int yos = sc.nextInt();
		System.out.println("ENTER SALARY ");
		double salary = sc.nextDouble();

		double total = bonus( yos , salary );
			
		System.out.println( "NET SALARY  : " + total );
	}
}

	
			
		
		
	