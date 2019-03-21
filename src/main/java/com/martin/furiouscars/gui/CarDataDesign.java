package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.MyCar;
import java.util.Scanner;

public class CarDataDesign {
    public static void printCarDatas(String carName){
        Garage garage = new Garage();
        MyCar myCar = garage.findCarByName(MyCar.cars,carName);
        System.out.printf("Your balance: $%s\n", MyCar.money);
        System.out.printf("Car name: %s\n",myCar.getCarName());
        System.out.printf("Engine level: %s\n",myCar.getEngine());
        System.out.println(" ");
        System.out.println("Press \"ENTER\" to continue");
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();
    }
}
