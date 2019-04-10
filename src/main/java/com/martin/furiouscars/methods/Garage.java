package com.martin.furiouscars.methods;

import java.util.ArrayList;
import java.util.Map;

public class Garage {

    private String name;
    private ArrayList<MyCar> cars;

    public Garage(String name,ArrayList<MyCar> currentGarage ){
        this.name = name;
        cars = currentGarage;
    }

    public void buyCar(String newCarName, RaceModelling raceModelling, String garageName){
        raceModelling.setMoney(raceModelling.getMoney()-250);
        cars.add(new MyCar(newCarName,1));

    }

    public void sellCar(String carName, RaceModelling raceModelling){
        MyCar myCar = findCarByName(carName);
        raceModelling.setMoney(raceModelling.getMoney() + 150+myCar.getEngine()*100);
        cars.remove(myCar);
    }
    public MyCar findCarByName(String carName){
        for (MyCar c : cars) {
            if(c.getCarName().equals(carName)){
                System.out.println(c);
                return c;
            }
        }
        return null;
    }

    public boolean carIsExists(String carName){
        if(cars.contains(carName)){
            return true;
        } else {
            return false;
        }
    }

        public ArrayList<MyCar> getCars() {
            return cars;
        }
}