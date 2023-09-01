package typeCasting;

import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TICKET QTY  ");
        int qty = sc.nextInt() ;
        System.out.println("SELECT PLATFORM ");
        System.out.println("1. BOOK MY SHOW ");
        System.out.println("2. PAYTM ");
        int ch = sc.nextInt() ;
        TicketBooking t1 ;
        if(ch == 1)
            t1 = (TicketBooking) new BookMyShow();
        else
            t1 = new PayTM();

        t1.bookTicket(qty);
    }
}
