package restaurant.billing;

public class ChickenDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        System.out.println("15% discount applied on Chicken items!");
        return price * 0.85;
    }
}
