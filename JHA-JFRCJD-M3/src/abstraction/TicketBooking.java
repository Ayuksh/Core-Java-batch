package abstraction;

public abstract class TicketBooking {
    public abstract void bookTicket(String from , String to , int qty);
    public abstract void cancleTicket(int ticketId , int qty) ;
}
