package com.martin.furiouscars.methods;

import java.util.Scanner;

public class Store {


    public Integer EngineUpgrade(Integer index) {
        //boolean notReady = true;
        //while (notReady){
        MyCar myCar = (MyCar) MyCar.cars.get(index);
            if (myCar.getEngine() < 5) {
                if (MyCar.money < myCar.getEngine() * 100) {

                    return 0;
                } else {
                    MyCar.money = myCar.getEngine() * 100;
                    myCar.setEngine(myCar.getEngine() + 1);
                    return 1;
                }
            } else {
                return 2;
            }
        }
    //return 3;
    //}

}
