package restaurant;

import restaurant.menu.*;
import restaurant.order.*;
import restaurant.payment.*;
import restaurant.billing.*;
import java.util.Scanner;

public class RestaurantFacade {

    public void startOrderProcess() {

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("Welcome to Gourmet Order Management System");
        System.out.println("-------------------------------------------\n");

        // 1- Select menu type (Vegetarian / Non-Vegetarian / Kids)
        System.out.print("Select Menu Type [veg / nonveg / kids]: ");
        String menuType = sc.nextLine().trim().toLowerCase();

        MenuFactory menuFactory;
        switch (menuType) {
            case "nonveg":
                menuFactory = new NonVegMenuFactory();
                break;
            case "kids":
                menuFactory = new KidsMenuFactory();
                break;
            default:
                menuFactory = new VegMenuFactory();
        }

        // 2- Create main dish dynamically from the selected factory
        IMenuItem item = menuFactory.createMainDish();

        // 3- Customizable Add-ons (Decorator Pattern)
        System.out.print("Add extra cheese? [y/n]: ");
        if (sc.nextLine().trim().equalsIgnoreCase("y")) {
            item = new ExtraCheeseDecorator(item);
        }

        System.out.print("Add extra sauce? [y/n]: ");
        if (sc.nextLine().trim().equalsIgnoreCase("y")) {
            item = new ExtraSauceDecorator(item);
        }
        System.out.print("Add extra toppings? [y/n]: ");
        if (sc.nextLine().trim().equalsIgnoreCase("y")) {
            item = new ExtraToppingsDecorator(item);
        }
        // 4- Choose order type (Dine-in / Delivery / Takeaway)
        System.out.print("Order Type [dinein / delivery / takeaway]: ");
        String orderTypeInput = sc.nextLine().trim().toLowerCase();

        OrderType orderType;
        switch (orderTypeInput) {
            case "delivery":
                orderType = OrderType.DELIVERY;
                break;
            case "takeaway":
                orderType = OrderType.TAKEAWAY;
                break;
            default:
                orderType = OrderType.DINE_IN;
        }

        // 5- Apply discount dynamically (Strategy Pattern)
        String category = item.getCategory().toLowerCase();
        DiscountStrategy discount;

        if (category.equals("pizza")) {
            discount = new PizzaDiscount(); // 10% discount
        } else if (category.equals("chicken")) {
            discount = new ChickenDiscount(); // 15% discount
        } else if (category.equals("meat")) {
            discount = new MeatDiscount(); // 20% discount
        } else {
            discount = new NoDiscount(); // No discount for other categories
        }

        double discountedPrice = discount.applyDiscount(item.getPrice());

        // 6- Apply tax on discounted price
        TaxPolicy taxPolicy = new TaxPolicy();
        double tax = taxPolicy.applyTax(discountedPrice);

        // 7- Add extra service or delivery charges
        double extraCharge = 0.0;
        if (orderType == OrderType.DELIVERY) {
            extraCharge = 25.0;
        } else if (orderType == OrderType.DINE_IN) {
            extraCharge = 10.0;
        }

        // 8- Calculate final total
        double total = discountedPrice + tax + extraCharge;

        // 9-Choose payment method (Card / Cash)
        System.out.print("Preferred Payment [card / cash]: ");
        String paymentType = sc.nextLine().trim().toLowerCase();

        PaymentStrategy payment;
        if (paymentType.equals("cash")) {
            payment = new CashPayment();
        } else {
            payment = new CardPayment();
        }

        // Execute payment
        payment.pay(total);

        // 10-Build final receipt (Builder Pattern)
        Bill bill = new BillBuilder()
                .setItem(item.getName() + " - Order Type: " + orderType)
                .setPrice(total)
                .build();

        System.out.println("\n========= YOUR RECEIPT =========");
        System.out.println(bill);
        System.out.printf("  Tax Applied: %.2f%n", tax);
        System.out.printf("  Extra Charges: %.2f%n", extraCharge);
        System.out.printf("  Total Due: %.2f%n", total);
        System.out.println("===================================\n");

        // 11-Place the order and notify observers (Observer Pattern)
        Order order = new Order();
        order.addObserver(new KitchenObserver());
        order.addObserver(new WaiterObserver());
        order.placeOrder();

        System.out.println("Your order has been successfully placed!");
        System.out.println("Thank you for choosing Gourmet Restaurant.");
        System.out.println("------------------------------------------------");
    }
}
