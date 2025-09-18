package Training_250918.AirlineSystem;

public final class Ticket {
    private String ticketNumber;
    private Passenger passenger;
    private Flight flight;

    public Ticket(String ticketNumber, Passenger passenger, Flight flight) {
        this.ticketNumber = ticketNumber;
        this.passenger = passenger;
        this.flight = flight;
    }

    public void showTicket() {
        System.out.println("Ticket: " + ticketNumber + " for passenger " + passenger.name + " on flight " + flight.getFlightNumber());
    }
}
