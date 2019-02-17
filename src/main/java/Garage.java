import java.util.Scanner;

public class Garage {
    public void SellParts(){
        boolean notQuit = true;
        while (notQuit){
            int choice = 312312;
            System.out.println("     |̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅|");
            System.out.println("     |      Garage     |");
            System.out.println("     |̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶|");
            System.out.println("          0. Leave");
            System.out.println("       1. Sell engine");
            System.out.println("       2. Sell weight");
            System.out.println("        3. Sell gear");
            System.out.println("        4. Sell tire\n");
            Scanner userInput = new Scanner(System.in);
            System.out.print("Choose an option: ");
            try {
                choice = userInput.nextInt();
            } catch (Exception e) {
                choice = 435;
            }
            switch (choice) {
                case 0:
                    notQuit = false;
                    break;
                case 1:
                    SellEngine();
                    break;
                case 2:
                    SellWeight();
                    break;
                case 3:
                    SellGear();
                    break;
                case 4:
                    SellTire();
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
        }

    private static void SellEngine() {
        if (MyCar.engine > 1) {
                MyCar.money += MyCar.engine * 50;
                MyCar.engine -= 1;
                System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.engine);
        } else {
            System.out.println("This is the minimum level.");
        }
    }
    private static void SellGear() {
        if (MyCar.gear > 1) {
                MyCar.money += MyCar.gear*100;
                MyCar.gear -= 1;
                System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.gear);
        } else {
            System.out.println("This is the minimum level.");
        }
    }
    private static void SellWeight() {
        if (MyCar.weight > 1) {
                MyCar.money += MyCar.weight * 100;
                MyCar.weight -= 1;
                System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.weight);
        } else {
            System.out.println("This is the minimum level.");
        }
    }

    private static void SellTire() {
        if (MyCar.tires > 1) {
                MyCar.money += MyCar.tires * 50;
                MyCar.tires -= 1;
                System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.tires);
        } else {
            System.out.println("This is the minimum level.");
        }
    }
}