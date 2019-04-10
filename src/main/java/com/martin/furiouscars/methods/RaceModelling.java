package com.martin.furiouscars.methods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RaceModelling implements Serializable {
    //List garages = new List();
    private Map<String, ArrayList<MyCar>> garages = new HashMap<>();
    private int money = 900;

    public Map<String, ArrayList<MyCar>> getGarages() {
        return garages;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public RaceModelling(Map<String, ArrayList<MyCar>> garages, int money) {
        this.garages = garages;
        this.money = money;
    }

    public boolean garageIsValid(String garageName, Map<String,ArrayList<MyCar>> garages) {
        if(garages.containsKey(garageName)){
            return true;
        } else {
            return false;
        }
    }

    public boolean hasGarages() {
        return !garages.isEmpty();
    }

    public void addGarage(String newGarageName) throws RaceModellingException {
        // is name unique if not throw exception
        if(garages.containsKey(newGarageName)){
            throw new RaceModellingException("Garage with this name is alredy exists.");
        }
        garages.put(newGarageName, new ArrayList<MyCar>());
    }

    public Garage findByName(String name) {
        // if garage with name exists return it, otherwise error or null
        if(garages.containsKey(name)){
            return new Garage(name,garages.get(name));
        }
        return null;
    }

    public void addCarToGarage(String newCarName, String newGarageName) {
        // garage exists? if not error
        // if exists ok
        // if car exists in garage error
        // if not add it
        // if all is ok, reduce money
    }

    public boolean garageIsExist(String garageName){
        if(garages.containsKey(garageName)){
            return true;
        } else {
            return false;
        }
    }

    public int race(RaceType type, String garageName, String carName) throws OutOfMoneyException, RaceModellingException {
        Garage garage = findByName(garageName);
            if (type == RaceType.Drag) {
                return new DragRace().WhoIsTheWinner(garage.findCarByName(carName),this);
            } else if(type == RaceType.Visual){
                return new VisualRace().WhoIsTheWinner(garage.findCarByName(carName),this);
            } else {
                throw new RaceModellingException("Invalid race type");
            }
        }
}
