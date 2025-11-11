package restaurant.menu;

public class EasternPizza implements IMenuItem{

    @Override

    public String getName() {
        return "Eastern Veg Pizza";
    }

    @Override

    public double getPrice() {
        return 110.0;
    }
    
    @Override
    public String getCategory() {
        return "pizza";
    }
}
