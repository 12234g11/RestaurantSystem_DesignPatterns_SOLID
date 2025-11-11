package restaurant.menu;

public class ExtraSauceDecorator implements IMenuItem {
    private IMenuItem item;

    public ExtraSauceDecorator(IMenuItem item) {
        this.item = item;
    }

    @Override
    public String getName() {
        return item.getName() + " + Extra Sauce";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 10.0;
    }
    
    @Override
    public String getCategory() {
        return item.getCategory();
    }
}
