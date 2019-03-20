package com.martin.furiouscars.methods;

import java.util.ArrayList;
import java.util.List;

public class MyCar {

    public int money;
    private String carName;
    private String color;
    private int engine;
    private int weight;
    private int gear;
    private int tires;
    public static List cars = new ArrayList();


    public MyCar(int money, String carName, String color, int engine, int weight, int gear, int tires) {
        this.money = money;
        this.carName = carName;
        this.color = color;
        this.engine = engine;
        this.weight = weight;
        this.gear = gear;
        this.tires = tires;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public void NewGame(String newCarName, String newCarColor){
        money = 900;
        carName = newCarName;
        color = newCarColor;
        engine = 1;
        weight = 1;
        gear = 1;
        tires = 1;
        XML.updateCarList(money,carName,color,engine,weight,gear,tires);
    }
    public void buyCar(String newCarName, String newCarColor){
        cars.add();
        money = 900;
        carName = newCarName;
        color = newCarColor;
        engine = 1;
        weight = 1;
        gear = 1;
        tires = 1;
        XML.updateCarList(money,carName,color,engine,weight,gear,tires);
    }
}
