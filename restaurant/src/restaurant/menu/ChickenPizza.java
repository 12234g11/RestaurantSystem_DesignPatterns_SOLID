package restaurant.menu;

public class ChickenPizza implements IMenuItem {
    @Override

    public String getName() {
        return "Chicken Pizza";
    }

    @Override

    public double getPrice() {
        return 130.0;
    }

    @Override
    public String getCategory() {
        return "pizza";
    }
}
