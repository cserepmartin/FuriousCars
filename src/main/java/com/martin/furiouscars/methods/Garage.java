package com.martin.furiouscars.methods;

import java.util.ArrayList;
import java.util.List;

public class Garage {


    public void buyCar(String newCarName){
        MyCar.money -= 300;
        MyCar.cars.add(new MyCar(newCarName,1));
    }

    public void sellCar(Integer index){
        MyCar.money -= 300;
        MyCar.cars.remove(index);
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