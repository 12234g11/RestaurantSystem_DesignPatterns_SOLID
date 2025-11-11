package restaurant.menu;

public class Pizza implements IMenuItem {
    @Override
    public String getName() {
        return "Veg Pizza";
    }

    @Override
    public double getPrice() {
        return 100.0;
    }

    @Override
    public String getCategory() {
        return "pizza";
    }
}