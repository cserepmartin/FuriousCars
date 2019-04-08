package com.martin.furiouscars.methods;

public class Store {


    public Integer EngineUpgrade(String carName, Money money, Garage garage,RaceModelling raceModelling) {
        MyCar myCar = garage.findCarByName(raceModelling,carName);
            if (myCar.getEngine() < 5) {
                if (money.money < myCar.getEngine() * 100) {

                    return 0;
                } else {
                    money.money -= myCar.getEngine() * 100;
                    myCar.setEngine(myCar.getEngine() + 1);
                    return 1;
                }
            } else {
                return 2;
            }
        }
}
