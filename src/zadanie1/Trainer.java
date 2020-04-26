package zadanie1;

public class Trainer extends Person {
    String subject;

    public Trainer(String firstName, String lastName, Address address, String subject) {
        super(firstName, lastName, address);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return "Trainers{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
