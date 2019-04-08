package com.martin.furiouscars.methods;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    public void buyCar(String newCarName,Money money,RaceModelling raceModelling,String garageName){
        money.money -= 300;
        raceModelling.garages.get(garageName).add(new MyCar(newCarName,1));

    }

    public void sellCar(String carName, Money money){
        MyCar myCar = findCarByName(getCars(),carName);
        money.money += 150+myCar.getEngine()*100;
        cars.remove(myCar);
    }
    public MyCar findCarByName(List<MyCar> cars, String carName){
        for (MyCar c : cars) {
            if(c.getCarName().equals(carName)){
                return c;
            }
        }
        return null;
    }

        public ArrayList<MyCar> cars = new ArrayList<>();

        public ArrayList<MyCar> getCars() {
            return cars;
        }
    public void buyGarage(String newGarageName, Money money, RaceModelling raceModelling){
            raceModelling.garages.put(newGarageName,new ArrayList<MyCar>());
    }
}