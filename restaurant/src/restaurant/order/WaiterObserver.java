package restaurant.order;

public class WaiterObserver implements OrderObserver {
    @Override
    public void update() {
        System.out.println("Waiter notified: Serve the order!");
    }
}
