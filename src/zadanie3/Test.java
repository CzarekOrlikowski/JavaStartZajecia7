package zadanie3;

public class Test {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Jan", "Kowalski", 34,
                Address.createAddress("Wrocław", "Zileona", "11B"), 239.5);

        Director director1 = new Director ("Jan", "Kowalski", 34,
                Address.createAddress("Wrocław", "Zileona", "11B"), 1200, 300);


        System.out.print("Dane odnośnie klienta: ");
        System.out.println(customer1.printInfo());

        System.out.print("Dane odnośnie dyrektora: ");
        System.out.println(director1.printInfo());

    }

}

