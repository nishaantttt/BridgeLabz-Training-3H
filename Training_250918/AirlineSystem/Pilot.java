package Training_250918.AirlineSystem;

// Interface → Flyable
interface Flyable {
    void flyPlane();
}

public class Pilot extends Staff implements Flyable {
    public Pilot(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public String getRole() {
        return "Pilot";
    }

    @Override
    public void flyPlane() {
        System.out.println(name + " is flying the plane.");
    }
}
