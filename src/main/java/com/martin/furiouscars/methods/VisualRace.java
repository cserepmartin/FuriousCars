package com.martin.furiouscars.methods;

import java.util.Scanner;

public class VisualRace extends Race {

    public boolean vRace(Boolean winner,Money money){

        if(winner){
            money.money += 1000;

            return true;
        } else {
            money.money -= 100;
            return false;
        }
    }
}
