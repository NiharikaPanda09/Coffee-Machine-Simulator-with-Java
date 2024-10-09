package machine;
import java.util.*;

 class CoffeeType {
     int water;
     int milk;
     int beans;
     int money;

     CoffeeType(int water, int milk, int beans, int money) {
         this.water = water;
         this.milk = milk;
         this.beans = beans;
         this.money = money;
     }
 }
     class CoffeeMachineApp {
         private int water;
         private int milk;
         private int beans;
         private int cups;
         private int money;
         private int CoffeeCount;
         private boolean clean;


         private CoffeeType espresso = new CoffeeType(250, 0, 16, 4);
         private CoffeeType latte = new CoffeeType(350, 75, 20, 7);
         private CoffeeType cappuccino = new CoffeeType(200, 100, 12, 6);

         CoffeeMachineApp() {
             this.water = 400;
             this.milk = 540;
             this.beans = 120;
             this.cups = 9;
             this.money = 550;
             this.CoffeeCount = 0;
             this.clean = false;
         }

         public void displayState() {
             System.out.println("\n The coffee machine has:");
             System.out.println(water + " ml of water");
             System.out.println(milk + " ml of milk");
             System.out.println(beans + " g of coffee beans");
             System.out.println(cups + " disposable cups");
             System.out.println("$" + money + " of money");
         }

         private boolean checkResources(CoffeeType coffeeType) {
             if (water < coffeeType.water) {
                 System.out.println("Sorry, not enough water!");
                 return false;
             } else if (milk < coffeeType.milk) {
                 System.out.println("Sorry, not enough milk!");
                 return false;
             } else if (beans < coffeeType.beans) {
                 System.out.println("Sorry, not enough coffee!");
                 return false;
             }
             if (cups < 1) {
                 System.out.println("Sorry, not enough disposable cups!");
             }
             return true;
         }

         private void makeCoffee(CoffeeType coffeeType) {
             if (checkResources(coffeeType)) {
                 System.out.println("I have enough resources, making you a coffee!");
                 water -= coffeeType.water;
                 milk -= coffeeType.milk;
                 beans -= coffeeType.beans;
                 cups--;
                 money += coffeeType.money;
                 CoffeeCount++;
                 if (CoffeeCount >= 10) {
                     clean = true;
                 }
             }
         }

         public void buy() {
             if (clean) {

                 System.out.println("I need cleaning!");
                 return;
             }


             Scanner sc = new Scanner(System.in);
             System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
             String ch = sc.nextLine();
             switch (ch) {
                 case "1":
                     makeCoffee(espresso);
                     break;
                 case "2":
                     makeCoffee(latte);
                     break;
                 case "3":
                     makeCoffee(cappuccino);
                     break;
                 case "back":
                     break;
                 default:
                     System.out.println("Invalid choice");
             }

         }


         public void fill() {
             Scanner sc = new Scanner(System.in);
             System.out.print("Write how many ml of water you want to add: ");
             water += sc.nextInt();
             System.out.print("Write how many ml of milk you want to add: ");
             milk += sc.nextInt();
             System.out.print("Write how many grams of coffee beans you want to add: ");
             beans += sc.nextInt();
             System.out.print("Write how many disposable cups you want to add: ");
             cups += sc.nextInt();

         }

         public void take() {
             System.out.println("I gave you $" + money);
             money = 0;
         }

         public void cleaning() {
             if (clean) {
                 System.out.println("I have been cleaned!");
                 clean = false;
                 CoffeeCount = 0;
             } else {
                 System.out.println("No need to clean now.");
             }
         }


     }

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeMachineApp machine = new CoffeeMachineApp();
        boolean running = true;
        while (running) {

            System.out.println("Write action (buy, fill, take, clean,remaining,exit): ");

            String action = sc.next();


            switch (action) {
                case "buy":
                    machine.buy();
                    break;
                case "fill":
                   machine.fill();
                    break;
                case "take":
                    machine.take();
                    break;
                case "clean":
                    machine.cleaning();
                    break;
                case "remaining":
                    machine.displayState();
                    break;
                case "exit":

                    running = false;
                    break;

                default:
                    System.out.println("Invalid action!");
                    break;

            }
        }
    }
}
