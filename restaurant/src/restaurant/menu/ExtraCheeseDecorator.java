package restaurant.menu;

public class ExtraCheeseDecorator implements IMenuItem {
    private IMenuItem item;

    public ExtraCheeseDecorator(IMenuItem item) {
        this.item = item;
    }

    @Override
    public String getName() {
        return item.getName() + " + Extra Cheese";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 20.0;
    }

    @Override
    public String getCategory() {
        return item.getCategory();
    }
}