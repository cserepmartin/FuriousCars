package com.martin.furiouscars.methods;

import java.util.ArrayList;
import java.util.List;

public class Garage {


    public void buyCar(String newCarName){
        MyCar.money -= 300;
        MyCar.cars.add(new MyCar(newCarName,1));
    }

    public void sellCar(String carName){
        MyCar myCar = findCarByName(MyCar.cars,carName);
        MyCar.money += 150+myCar.getEngine()*100;
        MyCar.cars.remove(myCar);
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