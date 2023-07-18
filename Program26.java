import java.util.Scanner;

class Program26
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER ");
		int a = sc.nextInt();	
		
		switch( true )
		{
			case (a<10):
				System.out.println("A IS SMALLER THEN 10 ");
				break;
			case (a<20):
				System.out.println("A IS SMALLER THEN 20 ");
				break ;
			defalut:
				System.out.println("A IS GREATER THEN 20 ");
		}
	}
}