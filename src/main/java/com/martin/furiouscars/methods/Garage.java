package com.martin.furiouscars.methods;

import java.util.ArrayList;
import java.util.Map;

public class Garage {

    public void buyCar(String newCarName,Money money,RaceModelling raceModelling,String garageName){
        money.money -= 300;
        raceModelling.garages.get(garageName).add(new MyCar(newCarName,1));

    }

    public void sellCar(String carName, Money money, RaceModelling raceModelling){
        MyCar myCar = findCarByName(raceModelling,carName);
        money.money += 150+myCar.getEngine()*100;
        cars.remove(myCar);
    }
    public MyCar findCarByName(RaceModelling raceModelling, String carName){

        for (Map.Entry garages : raceModelling.garages.entrySet()) {
            System.out.printf("Garage name: %s\n",garages.getKey());
            ArrayList<MyCar> cars = (ArrayList<MyCar>) garages.getValue();
            for (MyCar c : cars) {
                if(c.getCarName().equals(carName)){
                    System.out.println(c);
                    return c;
                }
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
    public void sellGarage(String garageName, RaceModelling raceModelling){
            raceModelling.garages.remove(garageName);
    }
}