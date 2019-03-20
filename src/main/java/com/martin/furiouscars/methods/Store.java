package com.martin.furiouscars.methods;

import java.util.Scanner;

public class Store {


    public Integer EngineUpgrade(String carName) {
        //boolean notReady = true;
        //while (notReady){
        Garage garage = new Garage();
        MyCar myCar = garage.findCarByName(MyCar.cars,carName);
            if (myCar.getEngine() < 5) {
                if (MyCar.money < myCar.getEngine() * 100) {

                    return 0;
                } else {
                    MyCar.money = myCar.getEngine() * 100;
                    myCar.setEngine(myCar.getEngine() + 1);
                    //MyCar.cars.set(myCar.getEngine());
                    return 1;
                }
            } else {
                return 2;
            }
        }
    //return 3;
    //}

}
