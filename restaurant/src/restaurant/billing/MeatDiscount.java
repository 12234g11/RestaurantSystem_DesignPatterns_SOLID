package restaurant.billing;

public class MeatDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        System.out.println("20% discount applied on Meat items!");
        return price * 0.8;
    }
}
