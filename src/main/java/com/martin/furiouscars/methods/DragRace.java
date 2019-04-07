package com.martin.furiouscars.methods;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Random;

public class DragRace extends Race {
    public int OverallCarData(String carName,FirstGarage firstGarage) {
        Garage garage = new Garage();
        MyCar myCar = garage.findCarByName(firstGarage.cars,carName);
        myCarStat = myCar.getEngine();
        return myCarStat;
    }
    public int EnemyGenerator() {
        Random rand = new Random();
        enemyCarStat = rand.nextInt(5);
        return enemyCarStat;
    }
    @Override
    public int WhoIsTheWinner(String carName,FirstGarage firstGarage, Money money) throws ParserConfigurationException, SAXException, IOException {
        if(OverallCarData(carName,firstGarage)> EnemyGenerator()){
            money.setMoney(money.getMoney()+300);
            return 0;
        } else if(OverallCarData(carName,firstGarage) < EnemyGenerator()){
            money.setMoney(money.getMoney()-300);
            return 1;
        } else return 2;
    }
}
