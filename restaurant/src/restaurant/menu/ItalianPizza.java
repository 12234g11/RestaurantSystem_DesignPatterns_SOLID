package restaurant.menu;

public class ItalianPizza implements IMenuItem {
    @Override

    public String getName() {
        return "Italian Veg Pizza";
    }

    @Override

    public double getPrice() {
        return 120.0;
    }
    
    @Override
    public String getCategory() {
        return "pizza";
    }
}
