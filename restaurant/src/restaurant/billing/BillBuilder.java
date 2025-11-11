package restaurant.billing;

public class BillBuilder {
    private String item;
    private double price;

    public BillBuilder setItem(String item) {
        this.item = item;
        return this;
    }

    public BillBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public Bill build() {
        return new Bill(item, price);
    }
}
