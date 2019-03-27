package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.MyCar;

import java.util.ArrayList;
import java.util.Scanner;

public class CarDataDesign {
    Scanner scanner;

    public void printCarDatas(ArrayList<MyCar> cars,Scanner scanner){
        System.out.printf("Your balance: $%s\n", MyCar.money);
        for (MyCar c : cars) {
            System.out.printf("Name: %s | Engine: %s\n",c.getCarName(),c.getEngine());
        }
        System.out.println(" ");
        System.out.println("Press \"ENTER\" to continue");
        scanner.nextLine();
    }
}
