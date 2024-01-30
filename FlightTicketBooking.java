public class FlightTicketBooking {

    public Ticket ticketBooking(Customer customer){
        Ticket ticket=new Ticket("F","02");
        System.out.println(customer);
        return ticket;
    }


    public static void main(String[] args){
        FlightTicketBooking flight = new FlightTicketBooking();
        Ticket ticketBooking=flight.ticketBooking(new Customer(975623,"Chandhan","Mutyala",new Passport("IND898","09-09-78","HYD-TS")));
        System.out.println(ticketBooking);
    }


}
