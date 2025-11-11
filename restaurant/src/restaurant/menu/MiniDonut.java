package restaurant.menu;

public class MiniDonut implements IMenuItem {
    @Override

    public String getName() {
        return "Mini Donut (Kids)";
    }

    @Override

    public double getPrice() {
        return 65.0;
    }

    @Override
    public String getCategory() {
        return "donut";
    }
}
