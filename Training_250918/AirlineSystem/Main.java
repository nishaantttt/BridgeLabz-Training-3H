package Training_250918.AirlineSystem;

public class Main {
    public static void main(String[] args) {
        // Airline setup
        Airline airline = new Airline();
        Flight f1 = new Flight("AI101");
        airline.addFlight(f1);

        // Passenger booking a flight
        Passenger p1 = new Passenger("Nishant", 20, "9999999999");
        p1.bookFlight(f1);

        // Staff members
        Pilot pilot = new Pilot("Captain Raj", 45, "8888888888");
        CabinCrew crew = new CabinCrew("Anita", 28, "7777777777");

        // Ticket
        Ticket t1 = new Ticket("T123", p1, f1);
        t1.showTicket();

        // Dynamic Method Dispatch → Person reference, different objects
        Person personRef;

        personRef = p1;
        personRef.checkIn(); // Passenger version

        personRef = pilot;
        personRef.checkIn(); // Staff version

        personRef = crew;
        personRef.checkIn(); // Staff version

        // Flyable interface
        pilot.flyPlane();

        // Composition → Cockpit lives/dies with flight
        f1.showCockpit();
    }
}
