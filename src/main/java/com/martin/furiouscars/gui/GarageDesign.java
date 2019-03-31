package com.martin.furiouscars.gui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.martin.furiouscars.Main;
import com.martin.furiouscars.methods.FirstGarage;
import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.MyCar;

public class GarageDesign {
    Scanner scanner;
    Garage garage;
    public void SellParts(Scanner scanner, FirstGarage firstGarage){
        boolean notQuit = true;
        while (notQuit){

            int choice;
            System.out.println("     ___________________");
            System.out.println("     |                 |");
            System.out.println("     |      Garage     |");
            System.out.println("     |_________________|");
            System.out.println("          0. Leave");
            System.out.println("       1. Buy Car");
            System.out.println("       2. Sell Car\n");
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
                    System.out.printf("Select a name for your new car: \n");
                    String newCarName = scanner.nextLine();
                    garage.buyCar(newCarName, firstGarage);
                    printBuyCar(newCarName);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.printf("Select a name for your new car: \n");
                    String carNameForSale = scanner.nextLine();
                    garage.sellCar(carNameForSale, firstGarage);
                    printSellCar(carNameForSale);
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public void printBuyCar(String carName){
        System.out.printf("Your new car named %s is on the garage now.\n",carName);
    }
    public void printSellCar(String carName){
        System.out.printf("%s is sold. Your balance: %s\n",carName,MyCar.money);
    }

}
