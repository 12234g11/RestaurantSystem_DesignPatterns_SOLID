# Restaurant System (Design Patterns + SOLID Principles)

##  Overview  
This Java-based Restaurant Management System demonstrates the implementation of multiple **Design Patterns** and **SOLID Principles**.  
It allows users to view menus, customize meals with add-ons, apply discounts, and generate receipts with detailed billing.

---

##  Design Patterns Used  

| **Factory Method** | To create different types of menus dynamically (Veg, Non-Veg, Kids). |
| **Decorator** | To add extra toppings, cheese, or sauces to menu items dynamically. |
| **Strategy** | To apply various discount strategies (Pizza, Chicken, Meat). |
| **Builder** | To construct detailed bills step-by-step. |
| **Observer** | To notify the kitchen and waiter automatically when an order is placed. |
| **Facade** | To provide a unified interface that handles the complete ordering workflow. |

---

##  How to Run  

### Requirements
- **Java JDK 17+**
- **VS Code** or **IntelliJ IDEA** or **Command Prompt**

### 🪜 Steps
1. Open your terminal or VS Code terminal.
2. Navigate to the project directory:
   ```bash
   cd "D:\RestaurantSystem_DesignPatterns_SOLID"
   ```
3. Compile the project:
   ```bash
   javac -d bin src\restaurant\*.java src\restaurant\*\*.java
   ```
4. Run the program:
   ```bash
   java -cp bin restaurant.App
   ```

---

## User Flow Example  

```
-------------------------------------------
Welcome to Gourmet Order Management System
-------------------------------------------

Select Menu Type [veg / nonveg / kids]: veg  
Enter Veg Dish Type (Italian/Eastern): italian  
Add extra cheese? [y/n]: y  
Add extra sauce? [y/n]: y  
Add extra toppings? [y/n]: n  
Order Type [dinein / delivery / takeaway]: delivery  
Preferred Payment [card / cash]: cash
```

 **Output Example**

```
========= YOUR RECEIPT =========
Item: Italian Veg Pizza + Extra Cheese + Extra Sauce - Order Type: DELIVERY
Tax Applied: 18.90
Extra Charges: 25.00
Total Due: 178.90
===================================
Kitchen notified: Prepare the order!
Waiter notified: Serve the order!
Your order has been successfully placed!
```

---

## Discount Scenarios  

| Category | Discount | Example Item |
|-----------|-----------|---------------|
| **Pizza** | 10% off | Italian Veg Pizza → Price reduced by 10% |
| **Chicken** | 15% off | Chicken Burger → Price reduced by 15% |
| **Meat** | 20% off | Mini Meat Burger (Kids) → Price reduced by 20% |
| **Other Items** | No discount | Mini Donut (Kids) |

---

## Example Test Cases

| Test Case | Input | Expected Output |
|------------|--------|----------------|
| 1 | Veg → Italian Pizza + Cheese + Sauce + Delivery | 10% discount on pizza + tax + delivery fee |
| 2 | NonVeg → Chicken Burger + Cheese + Takeaway | 15% discount + tax |
| 3 | Kids → Mini Meat Burger + Sauce + DineIn | 20% discount + service charge |
| 4 | Kids → Mini Donut + No Add-ons | No discount, just tax |

---

## Notes
- Taxes are applied **after** discounts.
- Delivery fee = **25 EGP**, Dine-In = **10 EGP**.
- Default payment methods supported: **Cash** or **Card**.
- If no valid menu type is entered, system defaults to **Veg Menu**.
