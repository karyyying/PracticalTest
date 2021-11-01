package ticketSales;

public class Ticket {
    private Buyer buyer;

    public Ticket(Buyer buyer) {
        this.buyer = buyer;
    }

    public double getDiscountRate(Category item_cat, int item_quan) {
        double rate = 1.00;

        if (item_quan < 1) {
            return -1.00;
        }
        
        rate = Category.getCategoryRate(item_cat, item_quan);

        if (buyer.isBirthdayThisWeek()) {
            if (item_quan > 5) { // This statement is labeled as T1
                rate = 0.50 * rate; 
            } else {
                rate = 0.85 * rate;
            }
        }

        return rate;
    }

}
