package restaurant.menu;

public class MiniMeatBurger implements IMenuItem {
    @Override
    public String getName() {
        return "Mini Meat Burger (Kids)";
    }

    @Override
    public double getPrice() {
        return 50.0;
    }

    @Override
    public String getCategory() {
        return "meat";
    }
}