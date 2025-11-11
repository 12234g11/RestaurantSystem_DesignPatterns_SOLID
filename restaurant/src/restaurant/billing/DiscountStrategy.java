package restaurant.billing;

public interface DiscountStrategy {
    double applyDiscount(double price);
}