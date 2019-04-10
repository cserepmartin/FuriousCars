package com.martin.furiouscars.methods;

public class Store {


    public Integer EngineUpgrade(String carName, Garage garage, RaceModelling raceModelling) {
        MyCar myCar = garage.findCarByName(carName);
            if (myCar.getEngine() < 5) {
                if (raceModelling.getMoney() < myCar.getEngine() * 100) {

                    return 0;
                } else {
                    raceModelling.setMoney(raceModelling.getMoney()-myCar.getEngine() * 100);
                    myCar.setEngine(myCar.getEngine() + 1);
                    return 1;
                }
            } else {
                return 2;
            }
        }
}
