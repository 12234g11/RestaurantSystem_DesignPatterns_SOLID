package restaurant.billing;

public class PizzaDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        System.out.println("10% discount applied on Pizza!");
        return price * 0.9;
    }
}