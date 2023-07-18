import java.util.Scanner;

class Program27
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER TOTAL CLASSES !!");
		int ch = sc.nextInt();
		System.out.println("ENTER TOTAL CLASSES ATTENDED !!");
		int at = sc.nextInt();
		
		double percentage = (at/ch) * 100 ;
		
		switch( percentage >= 75)
		{
			case true : 
				System.out.println("STUDENT ALLOWED !!");
				break;
			case false :
				System.out.println("STUDENT NOT ALLOWED !!");
		}
	}
}
		
		