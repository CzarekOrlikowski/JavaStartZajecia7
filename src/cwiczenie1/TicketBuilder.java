package cwiczenie1;

import java.util.Scanner;

class TicketBuilder {

    private static Scanner scanner = new Scanner(System.in);

    static Ticket createTicket() {
        System.out.println("Wydarzenie:");
        String event = scanner.nextLine();
        System.out.println("Miejsce: ");
        String place = scanner.nextLine();
        System.out.println("Typ biletu ("
                + Ticket.TYPE_ONLINE + ", "
                + Ticket.TYPE_STANDARD + ", "
                + Ticket.TYPE_GIFT + ")");
        String type = scanner.nextLine();
        System.out.println("Podaj cenę:");
        double price = scanner.nextDouble();
        System.out.println("Zniżka (0 - 1)");
        double discount = scanner.nextDouble();
        scanner.nextLine();

        return new Ticket(event, place, type, price, discount);
    }

}
