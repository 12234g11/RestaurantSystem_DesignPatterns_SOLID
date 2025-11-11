package restaurant.menu;

public class ExtraToppingsDecorator implements IMenuItem {
    private IMenuItem item;

    public ExtraToppingsDecorator(IMenuItem item) {
        this.item = item;
    }

    @Override
    public String getName() {
        return item.getName() + " + Extra Toppings";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 15.0;
    }
    
    @Override
    public String getCategory() {
        return item.getCategory();
    }
}
