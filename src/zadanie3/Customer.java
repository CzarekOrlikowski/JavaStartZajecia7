package zadanie3;

public class Customer extends Person {
    private double totalSpending;

    public Customer(String firstName, String lastName, int age, Address address, double totalSpending) {
        super(firstName, lastName, age, address);
        this.totalSpending = totalSpending;
    }

    public double getTotalSpending() {
        return totalSpending;
    }

    public void setTotalSpending(double totalSpending) {
        this.totalSpending = totalSpending;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ", " + getTotalSpending();
    }
}
