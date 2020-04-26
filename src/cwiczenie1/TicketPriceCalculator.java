package cwiczenie1;

class TicketPriceCalculator {
private static final double STANDARD_TICKET_CHARGE = 5;
private static final double GIFT_TICKET_CHARGE = 0.05;

static double calculateFinalPrice(Ticket ticket) {
        switch (ticket.getType()) {
        case Ticket.TYPE_ONLINE:
        return onlinePrice(ticket);
        case Ticket.TYPE_STANDARD:
        return standardPrice(ticket);
        case Ticket.TYPE_GIFT:
        return giftPrice(ticket);
default:
        return standardPrice(ticket);
        }
        }

private static double giftPrice(Ticket ticket) {
        double originalPrice = ticket.getPrice();
        double giftPayment = GIFT_TICKET_CHARGE * originalPrice;
        return standardPrice(ticket) + giftPayment;
        }

private static double standardPrice(Ticket ticket) {
        return onlinePrice(ticket) + STANDARD_TICKET_CHARGE;
        }

private static double onlinePrice(Ticket ticket) {
        double price = ticket.getPrice();
        double discount = ticket.getDiscount();
        return price - (price * discount);
        }

        }
