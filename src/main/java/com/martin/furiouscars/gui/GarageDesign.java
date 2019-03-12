package com.martin.furiouscars.gui;

import java.util.Scanner;
import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.MyCar;

public class GarageDesign {
    public static void SellParts(){
        boolean notQuit = true;
        while (notQuit){
            Garage garage = new Garage();
            int choice = 312312;
            System.out.println("     ___________________");
            System.out.println("     |                 |");
            System.out.println("     |      Garage     |");
            System.out.println("     |_________________|");
            System.out.println("          0. Leave");
            System.out.println("       1. Sell engine");
            System.out.println("       2. Sell weight");
            System.out.println("        3. Sell gear");
            System.out.println("        4. Sell tire\n");
            Scanner userInput = new Scanner(System.in);
            System.out.print("Choose an option: ");
            try {
                choice = userInput.nextInt();
            } catch (Exception e) {
                choice = 435;
            }
            switch (choice) {
                case 0:
                    notQuit = false;
                    break;
                case 1:
                    int engineResult = garage.SellEngine();
                    if(engineResult == 1){
                        System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.engine);
                    } else {
                        System.out.println("This is the minimum level.");
                    }
                    break;
                case 2:
                    int weightResult = garage.SellWeight();
                    if(weightResult == 1){
                        System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.weight);
                    } else {
                        System.out.println("This is the minimum level.");
                    }
                    break;
                case 3:
                    int gearResult = garage.SellGear();
                    if (gearResult == 1) {
                        System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.gear);
                    } else {
                        System.out.println("This is the minimum level.");
                    }
                    break;
                case 4:
                    int tireResult = garage.SellTire();
                    if (tireResult ==1 ){
                        System.out.printf("%s's engine is downgraded to level %s", MyCar.carName, MyCar.tires);
                    } else {
                        System.out.println("This is the minimum level.");
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
}
