package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.MyCar;
import java.util.Scanner;

public class CarDataDesign {
    public static void printCarDatas(){
        MyCar myCar = new MyCar(Integer.parseInt(MyCar.cars.get(0).toString()),MyCar.cars.get(1).toString(),MyCar.cars.get(2).toString(),Integer.parseInt(MyCar.cars.get(3).toString()),Integer.parseInt(MyCar.cars.get(4).toString()),Integer.parseInt(MyCar.cars.get(5).toString()),Integer.parseInt(MyCar.cars.get(6).toString()));
        System.out.printf("Your balance: $%s\n", myCar.getMoney());
        System.out.printf("Car name: %s\n",myCar.getCarName());
        System.out.printf("Car color: %s\n",myCar.getColor());
        System.out.printf("Engine level: %s\n",myCar.getEngine());
        System.out.printf("Weight level: %s\n",myCar.getWeight());
        System.out.printf("Gear level: %s\n",myCar.getGear());
        System.out.printf("Tires level: %s\n",myCar.getTires());
        System.out.println(" ");
        System.out.println("Press \"ENTER\" to continue");
        Scanner userInput = new Scanner(System.in);
        userInput.nextLine();
    }
}
