import java.util.Scanner ;
	
class Theater
{
	static int ticketCount = 100 ;
	static double totalAmount = 0.0 ;

	public void bookTicket( int qty )
	{
		if(ticketCount < qty)
			return ;
		
		ticketCount = ticketCount - qty ;
		double billAmount = qty * 100 + (1.6*qty) ;
		totalAmount = billAmount + totalAmount ;
		
		System.out.println("****** BILL ******");
		System.out.println("TOTAL TICKET........"+ qty );
		System.out.println("COST OF 1 TICKET....100");
		System.out.println("TOTAL TAX..........."+ (1.6*qty));
		System.out.println("-------------------------");
		System.out.println("TOTAL AMOUNT "+ billAmount );
		System.out.println("-------------------------");
	}

	public void cancleTicket( int qty )
	{
		

	}

	public void displayTicket()
	{
		System.out.println("---------------------------------------");
		System.out.println("TOTAL AVAILABLE TICKET "+ ticketCount );
		System.out.println("TOTAL COLLECTED AMOUNT "+ totalAmount );			System.out.println("----------------------------------------");
	}
}

class TheaterApp
{
	public static void main(String[] args)
	{
		executeProgram();
	}	

	public static void executeProgram()
	{
		Theater t1 = new Theater();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n*******************************");
		System.out.println("AVAILABLE TICKETS :- "+ Theater.ticketCount );
		System.out.println("*******************************\n\n");
		
		System.out.println("SELECT OPTION");
		System.out.println("1. BOOK TICKET ");
		System.out.println("2. CANCLE TICKET ");
		System.out.println("3. DISPLAY TICKET ");
		int ch = sc.nextInt();

		int qty = 0 ;
		if(ch == 1 || ch ==2 )
		{
			System.out.println("ENTER TICKET QTY ");
			qty = sc.nextInt();
		}
			
		switch(ch)
		{
			case 1: 
				t1.bookTicket(qty);
				break ;
			case 2: 
				t1.cancleTicket(qty);
				break ;
			case 3:
				t1.displayTicket();
				break ;
			default:
				System.out.println("INVALID CHOICE !!");
		}
		
		executeProgram();
	}
}










 