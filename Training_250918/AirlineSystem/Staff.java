package Training_250918.AirlineSystem;

public abstract class Staff extends Person {
    public Staff(String name, int age, String contact) {
        super(name, age, contact);
    }

    @Override
    public void checkIn() {
        System.out.println(name + " (Staff) checked in at staff gate.");
    }
}
