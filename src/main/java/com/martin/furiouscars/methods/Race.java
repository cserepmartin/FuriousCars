package com.martin.furiouscars.methods;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Random;

public class Race  {
    int enemyCarStat;
    int myCarStat;
    public int OverallCarData() {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        myCarStat = myCar.getEngine() + myCar.getGear() + myCar.getTires() + myCar.getWeight();
        return myCarStat;
    }
    public int EnemyGenerator() {
        Random rand = new Random();
        enemyCarStat = rand.nextInt(26)+1;
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

    public Integer Racing() throws IOException, SAXException, ParserConfigurationException {
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        EnemyGenerator();
        OverallCarData();
        if(myCarStat>enemyCarStat) {
            myCar.setMoney(myCar.getMoney()+300);
            XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
            XML.updateXML("mycar.xml");
            return 1;
        } else if(myCarStat<enemyCarStat) {
            myCar.setMoney(myCar.getMoney()-300);
            XML.updateCarList(myCar.getMoney(),myCar.getCarName(),myCar.getColor(),myCar.getEngine(),myCar.getWeight(),myCar.getGear(),myCar.getTires());
            XML.updateXML("mycar.xml");
            return 2;
        } else {
            return 0;
        }
    }
}
