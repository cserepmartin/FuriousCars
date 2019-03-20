package com.martin.furiouscars.methods;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Random;

public class Race  {
    int enemyCarStat;
    int myCarStat;
    public int OverallCarData(String carName) {
        MyCar myCar = new MyCar("",MyCar.allCar.get(carName));
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

    public Integer Racing(String carName) throws IOException, SAXException, ParserConfigurationException {
        EnemyGenerator();
        OverallCarData(carName);
        if(myCarStat>enemyCarStat) {
           MyCar.money +=300;
            return 1;
        } else if(myCarStat<enemyCarStat) {
            MyCar.money +=300;
            return 2;
        } else {
            return 0;
        }
    }
}
