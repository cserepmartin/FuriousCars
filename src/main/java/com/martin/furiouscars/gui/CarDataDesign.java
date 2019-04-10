package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.Money;
import com.martin.furiouscars.methods.MyCar;
import com.martin.furiouscars.methods.RaceModelling;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CarDataDesign {
    private Scanner userInput;

    public CarDataDesign(Scanner scanner){
        this.userInput = scanner;
    }


    public void printCarDatas(RaceModelling raceModelling){
        userInput.nextLine();
        System.out.printf("Your balance: $%s\n", raceModelling.getMoney());
        for (Map.Entry garages : raceModelling.getGarages().entrySet()) {
            System.out.printf("Garage name: %s\n",garages.getKey());
            ArrayList<MyCar> cars = (ArrayList<MyCar>) garages.getValue();
            for (MyCar c : cars) {
                System.out.printf("Name: %s | Engine: %s\n", c.getCarName(), c.getEngine());
            }
        }
        System.out.println(" ");
        System.out.println("Press \"ENTER\" to continue");
        userInput.nextLine();
    }
}
