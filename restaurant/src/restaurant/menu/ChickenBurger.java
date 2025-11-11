package restaurant.menu;

public class ChickenBurger implements IMenuItem {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public double getPrice() {
        return 75.0;
    }

    @Override
    public String getCategory() {
        return "chicken";
    }
}
