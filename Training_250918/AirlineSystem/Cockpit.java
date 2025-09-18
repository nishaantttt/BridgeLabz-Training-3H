package Training_250918.AirlineSystem;

public class Cockpit {
    private String cockpitId;

    public Cockpit(String cockpitId) {
        this.cockpitId = cockpitId;
    }

    public void displayCockpit() {
        System.out.println("Cockpit ID: " + cockpitId);
    }
}
