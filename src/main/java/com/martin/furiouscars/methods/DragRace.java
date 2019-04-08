package com.martin.furiouscars.methods;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Random;

public class DragRace extends Race {
    private int enemyCarStat;
    private int myCarStat;
    private int OverallCarData(String carName, Garage garage, RaceModelling raceModelling) {
        MyCar myCar = garage.findCarByName(raceModelling,carName);
        myCarStat = myCar.getEngine();
        return myCarStat;
    }
    private int EnemyGenerator() {
        Random rand = new Random();
        enemyCarStat = rand.nextInt(5);
        return enemyCarStat;
    }
    @Override
    public int WhoIsTheWinner(String carName, Garage garage, RaceModelling raceModelling) throws OutOfMoneyException {
        if (raceModelling.getMoney()>300){
            if(OverallCarData(carName,garage, raceModelling)> EnemyGenerator()){
                raceModelling.setMoney(raceModelling.getMoney()+300);
                return 0;
            } else if(OverallCarData(carName,garage, raceModelling) < EnemyGenerator()){
                raceModelling.setMoney(raceModelling.getMoney()-300);
                return 1;
            } else return 2;
        } else {
            throw new OutOfMoneyException("You don't have money for this.");
        }
    }
}
