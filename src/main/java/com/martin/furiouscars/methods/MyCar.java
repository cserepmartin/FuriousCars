package com.martin.furiouscars.methods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyCar implements Serializable {

    private String carName;
    private int engine;


    public MyCar(String carName, int engine) {
        this.carName = carName;
        this.engine = engine;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }



    /*public void NewGame(String newCarName){
        money = 900;
        cars.clear();
        cars.add(new MyCar(newCarName,1));
    }*/

    @Override
    public String toString() {
        return "MyCar{" +
                "Car Name ='" + carName + '\'' +
                ", Engine Level =" + engine +
                '}';
    }
}
