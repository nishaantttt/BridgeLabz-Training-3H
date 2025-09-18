package Training_250918.AirlineSystem;

public class Flight {
    private String flightNumber;
    private Cockpit cockpit; // Composition

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
        this.cockpit = new Cockpit("CP-" + flightNumber); // Composition: created with flight
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void showCockpit() {
        cockpit.displayCockpit();
    }
}
