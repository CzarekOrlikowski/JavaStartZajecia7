package zadanie3;

public class Director extends Employee{
    double bonus;

    public Director(String firstName, String lastName, int age, Address address, double salary, double bonus) {
        super(firstName, lastName, age, address, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ", " + getBonus() + ", " + totalSalary();
    }

    public Double totalSalary(){
        return getSalary() + getBonus();
    }
}
