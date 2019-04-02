package com.martin.furiouscars.methods;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Random;

public abstract class Race {
    private int enemyCarStat;
    private int myCarStat;

    public int WhoIsTheWinner(Integer result){
        if(result == 0){
            return 0;
        } else if(result == 1){
            return 1;
        } else return 2;
    }
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

    public boolean booleanGenerator(){
        Random random = new Random();
        int result = random.nextInt(2)+1;
        if(result == 2){
            return true;
        } else {
            return false;
        }
    }
        public int DragRace(String carName,FirstGarage firstGarage,Money money) throws ParserConfigurationException, SAXException, IOException {
            DragRace dragRace = new DragRace();
            if(dragRace.Racing(OverallCarData(carName,firstGarage), EnemyGenerator(),money) == 0){
                return 0;
            } else if(dragRace.Racing(OverallCarData(carName,firstGarage), EnemyGenerator(),money) == 1){
                return 1;
            } else return 2;
        }
}
