package com.martin.furiouscars.methods;

import java.util.Random;

public class VisualRace extends Race {

    @Override
    public int WhoIsTheWinner(MyCar car, RaceModelling raceModelling) throws OutOfMoneyException {
        if(raceModelling.getMoney()>4150){
            System.out.println(raceModelling.getMoney());
            Random random = new Random();
            int result = random.nextInt(2)+1;
            if(result == 2){
                raceModelling.setMoney(raceModelling.getMoney()+1000);
                return 0;
            } else {
                raceModelling.setMoney(raceModelling.getMoney()-100);
                return 1;
            }
        } else {
            throw new OutOfMoneyException("You don't have enough money for this!");
        }
    }
}
