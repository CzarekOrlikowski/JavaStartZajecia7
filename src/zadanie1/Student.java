package zadanie1;

import java.util.Scanner;

public class Student extends Person {
    private String indexNumber;

    public Student(String firstName, String lastName, Address address, String indexNumber) {
        super(firstName, lastName, address);
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public static Student newStudentBuilder() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Numer indeksu: ");
        String indexNumber = scan.nextLine();
        System.out.print("Imię: ");
        String firstName = scan.nextLine();
        System.out.print("Nazwisko: ");
        String lastName = scan.nextLine();
        return new Student(firstName, lastName, Address.newAddressBuilder(), indexNumber);
    }

      public String toString() {
        return "Student{" +
                "index='" + getIndexNumber() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", address=" + getAddress() +
                '}';
    }
}
