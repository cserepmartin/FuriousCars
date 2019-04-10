package com.martin.furiouscars.gui;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.martin.furiouscars.methods.*;

public class GarageDesign {
    Scanner scanner;
    public void SellParts(Scanner scanner, RaceModelling raceModelling){
        boolean notQuit = true;
        while (notQuit){
            String garageName = null;
            int choice;
            System.out.println("     ___________________");
            System.out.println("     |                 |");
            System.out.println("     |      Garage     |");
            System.out.println("     |_________________|");
            System.out.println("          0. Leave");
            System.out.println("        1. Buy Garage");
            //System.out.println("        2. Sell Garage");
            System.out.println("        2. Buy Car");
            System.out.println("       3. Sell Car\n");
            System.out.print("Choose an option: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please type an integer: " + e.getMessage());
                continue;
            }
            switch (choice) {
                case 0:
                    notQuit = false;
                    break;
                case 1:
                    scanner.nextLine();
                    System.out.println("Select a name for your new garage: ");
                    garageName = scanner.nextLine();
                    try {
                        raceModelling.addGarage(garageName);
                    } catch (RaceModellingException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                /*case 2:
                    scanner.nextLine();
                    garageName = scanner.nextLine();
                    garage.sellGarage(garageName,raceModelling);
                    break;
                 */
                case 2:
                    scanner.nextLine();
                    System.out.println("Select a garage!");
                    garageName = scanner.nextLine();
                    if (raceModelling.garageIsExist(garageName)) {
                        Garage garage = raceModelling.findByName(garageName);
                        System.out.printf("Select a name for your new car: \n");
                        scanner.nextLine();
                        String newCarName = scanner.nextLine();
                        System.out.println(newCarName);
                        garage.buyCar(newCarName, raceModelling, garageName);
                        printBuyCar(newCarName);
                    } else {
                        System.out.printf("Garage named \"%s\" is not found!",garageName);
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Select a garage!");
                    garageName = scanner.nextLine();
                    if (raceModelling.garageIsExist(garageName)) {
                        Garage garage = raceModelling.findByName(garageName);
                        System.out.printf("Select a name for your new car: \n");
                        scanner.nextLine();
                        String carName = scanner.nextLine();
                        System.out.println(carName);
                        garage.sellCar(carName, raceModelling);
                        printSellCar(carName,raceModelling.getMoney());
                    } else {
                        System.out.printf("Garage named \"%s\" is not found!",garageName);
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public void printBuyCar(String carName){
        System.out.printf("Your new car named %s is on the garage now.\n",carName);
    }
    public void printSellCar(String carName, Integer money){
        System.out.printf("%s is sold. Your balance: %s\n",carName,money);
    }

}
