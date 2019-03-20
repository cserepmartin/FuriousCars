package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.MyCar;
import java.util.Scanner;

public class CarDataDesign {
    public static void printCarDatas(String carName){
        MyCar myCar = new MyCar(carName,MyCar.allCar.get(carName));
        System.out.printf("Your balance: $%s\n", MyCar.money);
        System.out.printf("Car name: %s\n",myCar.getCarName());
        System.out.printf("Engine level: %s\n",myCar.getEngine());
        System.out.println(" ");
        System.out.println("Press \"ENTER\" to continue");
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();
    }
}
