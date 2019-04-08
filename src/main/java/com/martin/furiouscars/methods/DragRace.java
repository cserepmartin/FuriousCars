package com.martin.furiouscars.methods;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Random;

public class DragRace extends Race {
    private int enemyCarStat;
    private int myCarStat;
    private int OverallCarData(String carName, Garage garage) {
        MyCar myCar = garage.findCarByName(garage.cars,carName);
        myCarStat = myCar.getEngine();
        return myCarStat;
    }
    private int EnemyGenerator() {
        Random rand = new Random();
        enemyCarStat = rand.nextInt(5);
        return enemyCarStat;
    }
    @Override
    public int WhoIsTheWinner(String carName, Garage garage, Money money) {
        if(OverallCarData(carName,garage)> EnemyGenerator()){
            money.setMoney(money.getMoney()+300);
            return 0;
        } else if(OverallCarData(carName,garage) < EnemyGenerator()){
            money.setMoney(money.getMoney()-300);
            return 1;
        } else return 2;
    }
}
