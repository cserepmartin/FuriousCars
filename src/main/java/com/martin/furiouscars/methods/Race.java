package com.martin.furiouscars.methods;

import java.util.Random;

public class Race  {
    int enemyCarStat;
    int myCarStat;
    public int OverallCarData() {
        myCarStat = MyCar.engine + MyCar.gear + MyCar.tires + MyCar.weight;
        return myCarStat;
    }
    public int EnemyGenerator() {
        Random rand = new Random();
        enemyCarStat = rand.nextInt(26)+1;
        return enemyCarStat;
    }

    public Integer Racing() {
        EnemyGenerator();
        OverallCarData();
        if(myCarStat>enemyCarStat) {
            MyCar.money += 300;
            return 1;
        } else if(myCarStat<enemyCarStat) {
            MyCar.money -= 300;
            return 2;
        } else {
            return 0;
        }
    }
}
