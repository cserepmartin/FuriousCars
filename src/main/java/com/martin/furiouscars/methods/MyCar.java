package com.martin.furiouscars.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCar {

    public static int money;
    private String carName;
    private String color;
    private int engine;
    public static Map<String,Integer> allCar = new HashMap<>();
    public static List cars = new ArrayList();


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



    public static void NewGame(String newCarName){
        money = 900;
        allCar.clear();
        allCar.put(newCarName,1);
    }
}
