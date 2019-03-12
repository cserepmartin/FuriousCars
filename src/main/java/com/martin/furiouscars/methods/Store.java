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
    public static void Respray() {

        Scanner userInput = new Scanner(System.in);
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        int choice = userInput.nextInt();
        switch (choice) {
            case 1:
                 myCar.setColor("Black");
                break;
            case 2:
                myCar.setColor("White");
                break;
            case 3:
                myCar.setColor("Red");
                break;
            case 4:
                myCar.setColor("Blue");
                break;
            case 5:
                myCar.setColor("Green");
                break;
            case 6:
                myCar.setColor("Grey");
                break;
            case 7:
                myCar.setColor("Cyan");
                break;
            case 8:
                myCar.setColor("Gold");
                break;
            case 9:
                myCar.setColor("Pink");
                break;
        }
    }



}