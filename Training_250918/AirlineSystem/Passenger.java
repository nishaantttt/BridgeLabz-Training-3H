package Training_250918.AirlineSystem;

public class Passenger extends Person {
    // just keep one flight instead of a whole list for simplicity
    private Flight flight;

    public Passenger(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Passenger";
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Passenger) checked in at the counter.");
    }

    // Association → Passenger is linked with a Flight
    public void bookFlight(Flight flight) {
        this.flight = flight; // store only one flight
        System.out.println(name + " booked flight " + flight.getFlightNumber());
    }
}
