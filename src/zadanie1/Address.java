package zadanie1;

import java.util.Scanner;

public class Address {
    private String city;
    private String street;
    private String number;

    public Address(String city, String street, String number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static Address newAddressBuilder(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Miejscowość: ");
        String city = scan.nextLine();
        System.out.print("Ulica: ");
        String street = scan.nextLine();
        System.out.print("Numer: ");
        String number = scan.nextLine();
        return new Address(city, street, number);
    }


    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
