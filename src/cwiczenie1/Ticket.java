package cwiczenie1;

public class Ticket {
    public static final String TYPE_ONLINE = "online";
    public static final String TYPE_STANDARD = "standard";
    public static final String TYPE_GIFT = "gift";

    private static int uniqueSequence = 1;

    private int id;
    private String event;
    private String address;
    private String type;
    private double price;
    private double discount;

    Ticket(String event, String address, String type, double price, double discount) {
        id = uniqueSequence;
        uniqueSequence++;
        this.event = event;
        this.address = address;
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    String getDescription() {
        return id + ", " + event +
                ", " + address +
                ", cena: " + price +
                "zł, zniżka: " + (discount * 100) +
                "%, typ biletu: " + typeDescription();
    }

    private String typeDescription() {
        switch (type) {
            case TYPE_ONLINE:
                return "bilet internetowy";
            case TYPE_STANDARD:
                return "bilet standardowy";
            case TYPE_GIFT:
                return "bilet prezentowy";
            default:
                return "bilet standardowy";
        }
    }
}