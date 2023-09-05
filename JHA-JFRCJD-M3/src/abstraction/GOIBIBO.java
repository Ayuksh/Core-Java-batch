package abstraction;

public class GOIBIBO extends TicketBooking{
    @Override
    public void bookTicket(String from, String to, int qty) {
        System.out.println( qty + " TICKET ARE BOOKED FROM "+ from + " TO "+ to);
        System.out.println("TOTAL PRICE IS " + qty * 100);
    }

    @Override
    public void cancleTicket(int ticketId, int qty) {
        System.out.println(" TICKET ID "+ ticketId + "CANCELED !!");
    }
}
