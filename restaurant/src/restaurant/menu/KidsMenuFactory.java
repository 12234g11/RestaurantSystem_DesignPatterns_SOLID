package restaurant.menu;

import java.util.Scanner;

public class KidsMenuFactory implements MenuFactory {

    @Override
    public IMenuItem createMainDish() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Kids Meal Type (MiniMeatBurger/MiniDonut): ");
        String type = sc.nextLine().toLowerCase();

        switch (type) {
            case "minimeatburger":
                return new MiniMeatBurger();
            case "minidonut":
                return new MiniDonut();
            default:
                System.out.println("Unknown choice, serving default Mini Meat Burger.");
                return new MiniMeatBurger();
        }
    }
}
