package zadanie3;

public class Address {
    private String city;
    private String street;
    private String number;

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

    public static Address createAddress(String city, String street, String number) {
        Address address = new Address();
        address.city = city;
        address.street = street;
        address.number = number;
        return address;
    }

    public String printInfo(){
        return getCity() + ", " + getStreet() + ", " + getNumber();
    }

}
