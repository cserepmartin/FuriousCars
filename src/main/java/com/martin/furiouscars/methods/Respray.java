package com.martin.furiouscars.methods;

import java.util.Scanner;

public class Respray {
    public static String Respray(Integer choice) {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        switch (choice) {
            case 1:
                myCar.setColor("Black");
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
                return "Black";
            case 2:
                myCar.setColor("White");
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
                return "White";
            case 3:
                myCar.setColor("Red");
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
                return "Red";
            case 4:
                myCar.setColor("Blue");
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
                return "Blue";
            case 5:
                myCar.setColor("Green");
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
                return "Green";
            case 6:
                myCar.setColor("Grey");
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
                return "Grey";
            case 7:
                myCar.setColor("Cyan");
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
                return "Cyan";
            case 8:
                myCar.setColor("Gold");
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
                return "Gold";
            case 9:
                myCar.setColor("Pink");
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
                return "Pink";
        }
        return "Black";
    }
}