package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.MyCar;
import java.util.Scanner;

public class CarDataDesign {
    public static void printCarDatas(){
        System.out.printf("Your balance: $%s\n", MyCar.money);
        System.out.printf("Car name: %s\n",MyCar.carName);
        System.out.printf("Car color: %s\n",MyCar.color);
        System.out.printf("Engine level: %s\n",MyCar.engine);
        System.out.printf("Weight level: %s\n",MyCar.weight);
        System.out.printf("Gear level: %s\n",MyCar.gear);
        System.out.printf("Tires level: %s\n",MyCar.tires);
        System.out.println(" ");
        System.out.println("Press \"ENTER\" to continue");
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();
    }
}
