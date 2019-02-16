import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        if (MyCar.carName == null) {
            System.out.println("Name your car: ");
            Scanner userInput = new Scanner(System.in);
            String newCarName = userInput.nextLine();
            MyCar.carName = newCarName;
            mainMenu();
        }else {
            mainMenu();
        }
    }
    public static void mainMenu(){
        boolean notQuit=true;
        while (notQuit)  {
            Scanner userInput = new Scanner(System.in);
            System.out.println("     |̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅̅|");
            System.out.println("     |   Furious Cars   |");
            System.out.println("     |̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶|");
            System.out.println("           0. Exit");
            System.out.println("          1. My Car");
            System.out.println("           2. Shop");
            System.out.println("           3. Race");
            System.out.print("\nChoose an option: ");
            int choice = userInput.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Thanks for playing. Bye");
                    System.exit(1);
                    break;
                case 1:
                    System.out.println("Not implemented yet!");
                    MyCar mycar = new MyCar();
                    mycar.printCarDatas();
                    break;
                case 2:
                    System.out.println("Not implemented yet!");
                    Store store = new Store();
                    store.storeDesign();
                    break;
                case 3:
                    if(MyCar.money<300) {
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        Race race = new Race();
                        race.Racing();
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
                    break;

            }
        }
    }
}
