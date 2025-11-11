package restaurant.billing;

public class Bill {
    private String item;
    private double price;

    public Bill(String item, double price) {
        this.item = item;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n BILL\nItem: " + item + "\nTotal: " + price + " EGP\n";
    }
}