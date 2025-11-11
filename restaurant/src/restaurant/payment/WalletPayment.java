package restaurant.payment;

public class WalletPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Mobile Wallet.");
    }
}