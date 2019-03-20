package com.martin.furiouscars.methods;

public class VisualRace extends Race {

    public boolean vRace(Boolean winner){
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if(winner){
            myCar.setMoney(myCar.getMoney()+500);
            XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
            return true;
        } else {
            myCar.setMoney(myCar.getMoney()-100);
            XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
            return false;
        }
    }
}
