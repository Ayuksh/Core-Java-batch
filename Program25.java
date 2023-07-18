import java.util.Scanner;

class Program25
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER ");
		int a = sc.nextInt();	
		
		switch( a )
		{
			case 10 :
				System.out.println("value of a is 10");
				break;
			case 20 :
				System.out.println("value of a is 20");
				break;
			case 30 :
				System.out.println("value of a is 30");
				break;
			case 40 :
				System.out.println("value of a is 40");
				break;
			default :
				System.out.println("INVALID NUMBER !!");
		}
	}

}