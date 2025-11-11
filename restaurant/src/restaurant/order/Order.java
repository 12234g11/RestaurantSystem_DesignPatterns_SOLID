package restaurant.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();

    public void addObserver(OrderObserver o) {
        observers.add(o);
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (OrderObserver o : observers) {
            o.update();
        }
    }
}
