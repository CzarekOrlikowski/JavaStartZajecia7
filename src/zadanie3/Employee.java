package zadanie3;

public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, int age, Address address, double salary) {
        super(firstName, lastName, age, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ", " + getSalary();
    }
}

