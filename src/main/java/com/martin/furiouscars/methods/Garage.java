package com.martin.furiouscars.methods;

import com.martin.furiouscars.Main;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    public static void buyCar(String newCarName, FirstGarage firstGarage){
        MyCar.money -= 300;
        firstGarage.cars.add(new MyCar(newCarName,1));
    }

    public void sellCar(String carName, FirstGarage firstGarage){
        MyCar myCar = findCarByName(firstGarage.getCars(),carName);
        MyCar.money += 150+myCar.getEngine()*100;
        firstGarage.cars.remove(myCar);
    }
    public static MyCar findCarByName(List<MyCar> cars, String carName){
        for (MyCar c : cars) {
            if(c.getCarName().equals(carName)){
                return c;
            }
        }
        return null;
    }

}