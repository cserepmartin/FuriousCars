package com.martin.furiouscars.methods;

public class Garage {


    public static Integer SellEngine() {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if (myCar.getMoney() > 1) {
                myCar.setMoney(myCar.getMoney()+(myCar.getEngine()*50));
                myCar.setEngine(myCar.getEngine()-1);
                return 1;
        } else {
            return 2;
        }
    }
    public static Integer SellGear() {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if (myCar.getGear() > 1) {
            myCar.setMoney(myCar.getMoney()+(myCar.getGear()*50));
            myCar.setGear(myCar.getGear()-1);
                return 1;
        } else {
            return 2;
        }
    }
    public static Integer SellWeight() {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if (myCar.getWeight() > 1) {
            myCar.setMoney(myCar.getMoney()+(myCar.getWeight()*50));
            myCar.setWeight(myCar.getWeight()-1);
                return 1;
        } else {
            return 2;
        }
    }

    public static Integer SellTire() {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if (myCar.getTires() > 1) {
            myCar.setMoney(myCar.getMoney()+(myCar.getTires()*50));
            myCar.setTires(myCar.getTires()-1);
                return 1;
        } else {
            return 2;
        }
    }
}