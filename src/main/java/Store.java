import java.util.Scanner;

public class Store {
    public static void storeDesign(){
        boolean notQuit = true;
        while (notQuit){
            int choice = 312312;
            System.out.println("     |̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅|");
            System.out.println("     |       Store      |");
            System.out.println("     |̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶|");
            System.out.println("          0. Leave");
            System.out.println("      1. Engine upgrade");
            System.out.println("      2. Weight upgrade");
            System.out.println("       3. Gear upgrade");
            System.out.println("       4. Tire upgrade");
            System.out.println("        5. Respray car\n");
            Scanner userInput = new Scanner(System.in);
            System.out.print("Choose an option: ");
            try {
                choice = userInput.nextInt();
            } catch (Exception e) {
                choice = 435;
            }
            switch (choice) {
                case 0:
                    System.out.println("Thanks for visiting us!");
                    notQuit = false;
                    break;
                case 1:
                    EngineUpgrade();
                    break;
                case 2:
                    WeightUprgade();
                    break;
                case 3:
                    GearUpgrade();
                    break;
                case 4:
                    TireUpgrade();
                    break;
                case 5:
                    if(MyCar.money < 200){
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        Respray();
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }

    private static void EngineUpgrade() {
        if (MyCar.engine < 5) {
            if(MyCar.money< MyCar.engine*100) {
                System.out.println("Sorry, but you don't have enough money for this!");
            } else {
                MyCar.money -= MyCar.engine * 100;
                MyCar.engine += 1;
                System.out.printf("%s's engine is upgraded to level %s\n", MyCar.carName, MyCar.engine);
            }
        } else {
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }
    private static void GearUpgrade() {
        if (MyCar.gear < 5) {
            if(MyCar.money< MyCar.gear*100) {
                System.out.println("Sorry, but you don't have enough money for this!");
            } else {
                MyCar.money -= MyCar.gear*100;
                MyCar.gear += 1;
                System.out.printf("%s's engine is upgraded to level %s\n", MyCar.carName, MyCar.gear);
            }
        } else {
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }
    private static void WeightUprgade() {
        if (MyCar.weight < 5) {
            if(MyCar.money< MyCar.weight*100) {
                System.out.println("Sorry, but you don't have enough money for this!");
            } else {
                MyCar.money -= MyCar.weight * 100;
                MyCar.weight += 1;
                System.out.printf("%s's engine is upgraded to level %s\n", MyCar.carName, MyCar.weight);
            }
        } else {
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }

    private static void TireUpgrade() {
        if (MyCar.tires < 5) {
            if(MyCar.money< MyCar.gear*100) {
                System.out.println("Sorry, but you don't have enough money for this!");
            } else {
                MyCar.money -= MyCar.tires * 100;
                MyCar.tires += 1;
                System.out.printf("%s's engine is upgraded to level %s\n", MyCar.carName, MyCar.tires);
            }
        } else {
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }
    private static void Respray() {
        System.out.println("       Select a color       ");
        System.out.println("1. Black | 2. White | 3. Red");
        System.out.println("4. Blue  | 5. Green | 6. Grey");
        System.out.println("7. Cyan  | 8. Gold  | 9. Pink");
        Scanner userInput = new Scanner(System.in);
        int choice = userInput.nextInt();
        switch (choice) {
            case 1:
                MyCar.color = "Black";
                break;
            case 2:
                MyCar.color = "White";
                break;
            case 3:
                MyCar.color = "Red";
                break;
            case 4:
                MyCar.color = "Blue";
                break;
            case 5:
                MyCar.color = "Green";
                break;
            case 6:
                MyCar.color = "Grey";
                break;
            case 7:
                MyCar.color = "Cyan";
                break;
            case 8:
                MyCar.color = "Gold";
                break;
            case 9:
                MyCar.color = "Pink";
                break;
        }
    }



}
