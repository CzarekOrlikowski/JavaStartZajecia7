package zadanie1;

import java.util.Scanner;

public class Person {
    protected String firstName;
    protected String lastName;
    protected Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static Person newPersonBuilder() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Imię: ");
        String firstName = scan.nextLine();
        System.out.print("Nazwisko: ");
        String lastName = scan.nextLine();
        return new Person(firstName, lastName, Address.newAddressBuilder());
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}

