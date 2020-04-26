package cwiczenie1;

class TicketApp {
    public static void main(String[] args) {
//        Ticket ticket1 = new Ticket("Koncert Metallica", "Wrocław, Hala Stulecia", Ticket.TYPE_GIFT, 300, 0.1);
//        Ticket ticket2 = new Ticket("Koncert Metallica", "Wrocław, Hala Stulecia", Ticket.TYPE_ONLINE, 200, 0.1);
//        Ticket ticket3 = new Ticket("Pokaz sztucznych ogni", "Szczecin", Ticket.TYPE_STANDARD, 50, 0);
//
//        System.out.println(ticket1.getId());
//        System.out.println(ticket2.getId());
//        System.out.println(ticket3.getId());

        Ticket ticket1 = TicketBuilder.createTicket();
        Ticket ticket2 = TicketBuilder.createTicket();

        double finalPrice1 = TicketPriceCalculator.calculateFinalPrice(ticket1);
        System.out.println(ticket1.getDescription() + ", ostateczna cena: " + finalPrice1);
        double finalPrice2 = TicketPriceCalculator.calculateFinalPrice(ticket2);
        System.out.println(ticket2.getDescription() + ", ostateczna cena: " + finalPrice2);
    }
}
