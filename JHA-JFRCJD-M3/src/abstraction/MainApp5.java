package abstraction;

import java.util.Scanner;

public class MainApp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("ENTER PICK UP LOCATION ");
        String from = sc.next() ;
        System.out.println("ENTER DESTINATION LOCATION");
        String to = sc.next() ;
        System.out.println("ENTER THE TICKET QTY ");
        int qty = sc.nextInt() ;

        System.out.println("SELECT THE PLATFORM ");
        System.out.println("1. MAKE MY TRIP ");
        System.out.println("2. GOIBIBO ");
        int ch = sc.nextInt() ;
        TicketBooking t1 ;
        if (ch == 1)
            t1 = new MakeMyTrip() ;
        else
            t1 = new GOIBIBO() ;

        t1.bookTicket(from , to , qty);
        main(args);
    }
}
