package Training_250918.AirlineSystem;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    public static String airlineName = "SkyHigh Airlines"; // Static field

    private List<Flight> flights = new ArrayList<>(); // Aggregation

    public void addFlight(Flight flight) {
        flights.add(flight);
        System.out.println("Flight " + flight.getFlightNumber() + " added to " + airlineName);
    }
}
