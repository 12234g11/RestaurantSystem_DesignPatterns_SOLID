package restaurant.menu;

import java.util.Scanner;

public class VegMenuFactory implements MenuFactory {

    @Override
    public IMenuItem createMainDish() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Veg Dish Type (Italian/Eastern): ");
        String type = sc.nextLine().toLowerCase();

        switch (type) {
            case "italian":
                return new ItalianPizza();
            case "eastern":
                return new EasternPizza();
            default:
                System.out.println("Unknown type, serving default Veg Pizza.");
                return new Pizza();
        }
    }
}