package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.Race;
import com.martin.furiouscars.methods.MyCar;

public class RaceDesign {
    public static void printRaceResult(Integer result){

        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        if(result == 1){
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", myCar.getMoney());
        } else if(result == 2){
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", myCar.getMoney());
        } else if(result == 10){
            System.out.println("It's a draw!");
        }
    }
}
