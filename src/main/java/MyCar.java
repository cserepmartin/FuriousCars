import java.util.Scanner;

public class MyCar {
    static int money;
    static String carName;
    static String color;
    static int engine ;
    static int weight;
    static int gear ;
    static int tires ;
    public void printCarDatas(){
        System.out.printf("Your balance: $%s\n",money);
        System.out.printf("Car name: %s\n",carName);
        System.out.printf("Car color: %s\n",color);
        System.out.printf("Engine level: %s\n",engine);
        System.out.printf("Weight level: %s\n",weight);
        System.out.printf("Gear level: %s\n",gear);
        System.out.printf("Tires level: %s\n",tires);
        System.out.println(" ");
        System.out.println("Press \"ENTER\" to continue");
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();
    }
    public void NewGame(){
        money = 900;
        carName = null;
        color = "blue";
        engine = 1;
        weight = 1;
        gear = 1;
        tires = 1;
        System.exit(1);
    }
}
