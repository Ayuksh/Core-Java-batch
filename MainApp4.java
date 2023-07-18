import java.util.Scanner;

class MainApp4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER CURRENT READING ");
		double cr = sc.nextDouble();
		System.out.println("ENTER PRIVIOUS READING ");
		double pr = sc.nextDouble();
		
		System.out.println("SELECT BILL TYPE ");
		System.out.println("1--> RESIDENTIAL \n2--> COMMERCIAL  ");
		int ch = sc.nextInt();
		
		switch( ch )
		{
			case 1 :
				double amt = BillCalculator.residentialBill( cr , pr );
				System.out.println("RESIDENTIAL BILL AMT "+ amt );
				break;
			case 2 :
				amt  = new BillCalculator().commercialBill( cr , pr );
				System.out.println("COMMERCIAL BILL AMT "+ amt );
				break;
			default :
				System.out.println("INVALID CHOICE !!");
		}

	}
}

class BillCalculator 
{
	public static double residentialBill( double cr , double pr )
	{
		double unit = cr - pr ;
		
		if(unit > 0)
			return unit * 7 ;
		else
			return 0 ;
	}
		
	public double commercialBill( double cr , double pr )
	{
		double unit = cr - pr ;
		
		if(unit > 0)
			return unit * 12 ;
		else
			return 0 ;
	}
}

	




























		
		
		