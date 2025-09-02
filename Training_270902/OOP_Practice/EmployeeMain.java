package Training_270902.OOP_Practice;

public class EmployeeMain{
    public static void employeeDetails(Employee emp){
        System.out.println(emp.name);
        System.out.println(emp.id);
        System.out.println(emp.salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Nishant",27,0);
        employeeDetails(emp1);
    }
}