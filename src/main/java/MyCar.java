import java.util.Scanner;

public class MyCar {
    static int money;
    static String carName;
    static String color;
    static int engine ;
    static int weight;
    static int gear ;
    static int tires ;


    public static int getMoney() {
        return money;
    }

    public static String getCarName() {
        return carName;
    }

    public static String getColor() {
        return color;
    }

    public static int getEngine() {
        return engine;
    }

    public static int getWeight() {
        return weight;
    }

    public static int getGear() {
        return gear;
    }

    public static int getTires() {
        return tires;
    }

    public void NewGame(String newCarName){
        money = 900;
        carName = null;
        color = newCarName;
        engine = 1;
        weight = 1;
        gear = 1;
        tires = 1;
        System.exit(1);
    }
}
