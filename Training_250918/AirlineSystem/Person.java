package Training_250918.AirlineSystem;

// Abstract Class → Abstraction
public abstract class Person {
    protected String name;
    protected int age;
    protected String contact;

    public Person(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    // Abstract method → must be implemented by subclasses
    public abstract String getRole();

    // Polymorphic method
    public abstract void checkIn();
}
