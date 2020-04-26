package zadanie1;

import java.util.Scanner;

public class Trainer extends Person {
    String education;

    public Trainer(String firstName, String lastName, Address address, String education) {
        super(firstName, lastName, address);
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public static Trainer newTrainerBuilder() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wykształcenie: ");
        String education = scan.nextLine();
        System.out.print("Imię: ");
        String firstName = scan.nextLine();
        System.out.print("Nazwisko: ");
        String lastName = scan.nextLine();
        return new Trainer(firstName, lastName, Address.newAddressBuilder(), education);
    }

    public String toString() {
        return "Trainer{" +
                "subject='" + getEducation() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", address=" + getAddress() +
                '}';
    }
}
