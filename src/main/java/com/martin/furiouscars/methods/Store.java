package com.martin.furiouscars.methods;

import java.util.Scanner;

public class Store {


    public static Integer EngineUpgrade(String carName) {
        MyCar myCar = Garage.findCarByName(MyCar.cars,carName);
            if (myCar.getEngine() < 5) {
                if (MyCar.money < myCar.getEngine() * 100) {

                    return 0;
                } else {
                    MyCar.money -= myCar.getEngine() * 100;
                    myCar.setEngine(myCar.getEngine() + 1);
                    return 1;
                }
            } else {
                return 2;
            }
        }
}
