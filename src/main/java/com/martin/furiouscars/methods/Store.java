package com.martin.furiouscars.methods;

import java.util.Scanner;

public class Store {


    public Integer EngineUpgrade() {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if (myCar.getEngine() < 5) {
            if(myCar.getMoney()< myCar.getEngine()*100) {
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());

                return 0;
            } else {
                myCar.setMoney(myCar.getMoney()-(myCar.getEngine() * 100));
                myCar.setEngine(myCar.getEngine()+1);
                XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
                return 1;
            }
        } else {

            return 2;
        }
    }
    public Integer GearUpgrade() {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if (myCar.getGear() < 5) {
            if(myCar.getMoney()< myCar.getGear()*100) {
                return 0;
            } else {
                myCar.setMoney(myCar.getMoney()-(myCar.getGear()*100));
                myCar.setGear(myCar.getGear()+1);
                return 1;
            }
        } else {
            return 2;
        }
    }
    public Integer WeightUprgade() {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if (myCar.getWeight() < 5) {
            if(myCar.getMoney()< myCar.getWeight()*100) {
                return 0;
            } else {
                myCar.setMoney(myCar.getMoney()-(myCar.getWeight()*100));
                myCar.setWeight(myCar.getWeight()+1);
                return 1;
            }
        } else {
            return 2;
        }
    }

    public Integer TireUpgrade() {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if (myCar.getTires() < 5) {
            if(myCar.getMoney() < myCar.getTires()*100) {
                return 0;
            } else {
                myCar.setMoney(myCar.getMoney()-(myCar.getTires()*100));
                myCar.setTires(myCar.getTires()+1);
                return 1;
            }
        } else {
            return 2;
        }
    }




}
