package restaurant.billing;

public class NoDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        System.out.println("No discount applied for this item.");
        return price;
    }
}
