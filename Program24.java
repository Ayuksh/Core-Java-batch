import java.util.Scanner;

class Program24
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("ENTER NUMBER ");
		int a = sc.nextInt();
		
		if(a == 10)
			System.out.println("value of a is 10");
		else if(a == 20)
			System.out.println("value of a is 20");
		else if(a == 30)
			System.out.println("value of a is 30");
		else
			System.out.println("INVALID NUMBBER !!");
	
	}

}