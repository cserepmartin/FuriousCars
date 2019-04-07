package com.martin.furiouscars.methods;

import java.util.Random;
import java.util.Scanner;

public class VisualRace extends Race {

    @Override
    public int WhoIsTheWinner(String carName, FirstGarage firstGarage,Money money){
        Random random = new Random();
        int result = random.nextInt(2)+1;
        if(result == 2){
            money.setMoney(money.getMoney()+1000);
            return 0;
        } else {
            money.setMoney(money.getMoney()-100);
            return 1;
        }
    }
}
