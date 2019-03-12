package com.martin.furiouscars.methods;

public class MyCar {
    public static int money;
    public static String carName;
    public static String color;
    public static int engine ;
    public static int weight;
    public static int gear ;
    public static int tires ;


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
