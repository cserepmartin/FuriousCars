package com.martin.furiouscars.methods;

import java.util.Scanner;

public class VisualRace extends Race {

    public boolean vRace(Boolean winner){

        if(winner){
            MyCar.money += 1000;

            return true;
        } else {
            MyCar.money -= 100;
            return false;
        }
    }
}
