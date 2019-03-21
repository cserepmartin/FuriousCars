package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.MyCar;

import java.util.List;
import java.util.Scanner;

import static com.martin.furiouscars.methods.MyCar.cars;

public class CarDataDesign {

    public static void printCarDatas(List<MyCar> cars){
        System.out.printf("Your balance: $%s\n", MyCar.money);
        for (MyCar c : cars) {
            System.out.printf("Name: %s | Engine: %s\n",c.getCarName(),c.getEngine());
        }
        System.out.println(" ");
        System.out.println("Press \"ENTER\" to continue");
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();
    }
}
