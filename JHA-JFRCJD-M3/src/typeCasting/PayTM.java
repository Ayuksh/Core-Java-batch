package typeCasting;

public class PayTM extends TicketBooking{
    @Override
    public void bookTicket(int qty) {
        double total = qty * 100 ;
        System.out.println("TOTAL PRICE FOR TICKET IS "+total);
    }
}
