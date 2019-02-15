import java.util.Scanner;

public class MyCar {
    static String carName = null;
    static int engine = 1;
    static int weight = 1;
    static int gear = 1;
    static int tires = 1;
    public void printCarDatas(){
        System.out.printf("Car name: %s\n",carName);
        System.out.printf("Engine level: %s\n",engine);
        System.out.printf("Weight level: %s\n",weight);
        System.out.printf("Gear level: %s\n",gear);
        System.out.printf("Tires level: %s\n",tires);
        System.out.println(" ");
        System.out.println("Press \"ENTER\" to continue");
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();
    }
}
