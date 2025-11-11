package restaurant.menu;
import java.util.Scanner;

public class NonVegMenuFactory implements MenuFactory {

    @Override
    public IMenuItem createMainDish() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Non-Veg Dish Type (ChickenPizza/ChickenBurger): ");
        String type = sc.nextLine().toLowerCase();

        switch (type) {
            case "chicken":
                return new ChickenPizza();
            case "burger":
                return new ChickenBurger();
            default:
                System.out.println("Unknown choice, serving default Chicken Burger.");
                return new ChickenBurger();
        }
    }
}
