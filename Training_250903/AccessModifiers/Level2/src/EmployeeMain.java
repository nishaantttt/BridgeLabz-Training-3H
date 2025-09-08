public class EmployeeMain {
    private int id;
    private String department;
    private double salary;

    public EmployeeMain(int id, String department, double salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("ID: " + id + ", Department: " + department + ", Salary: " );
    }
}