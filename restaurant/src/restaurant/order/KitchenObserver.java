package restaurant.order;

public class KitchenObserver implements OrderObserver {
    @Override
    public void update() {
        System.out.println("Kitchen notified: Prepare the order!");
    }
}
