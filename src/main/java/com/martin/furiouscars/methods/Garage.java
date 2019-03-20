package com.martin.furiouscars.methods;

import java.util.ArrayList;
import java.util.List;

public class Garage {


    public void buyCar(String newCarName){
        MyCar.money -= 300;
        MyCar.allCar.put(newCarName,1);
        MyCar.cars.add(new MyCar(newCarName,1));
    }

    public void sellCar(String carName){
        MyCar.money -= 300;
        MyCar.allCar.remove(carName);
        MyCar.cars.remove(carName);
    }
}