package com.martin.furiouscars.gui;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.MyCar;

public class GarageDesign {
    public static void SellParts(){
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
            Scanner userInput = new Scanner(System.in);
            System.out.print("Choose an option: ");
            try {
                choice = userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please type an integer: " + e.getMessage());
                continue;
            }
            switch (choice) {
                case 0:
                    notQuit = false;
                    break;
                case 1:
                    System.out.printf("Select a name for your new car: \n");
                    Scanner carNameUserInput = new Scanner(System.in);
                    String newCarName = carNameUserInput.nextLine();
                    Garage garage = new Garage();
                    garage.buyCar(newCarName);
                    printBuyCar(newCarName);
                    break;
                case 2:
                    System.out.printf("Select a name for your new car: \n");
                    Scanner carNameInputForSale = new Scanner(System.in);
                    String carNameForSale = carNameInputForSale.nextLine();
                    Garage garage1 = new Garage();
                    garage1.sellCar(carNameForSale);
                    printSellCar(carNameForSale);
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public static void printBuyCar(String carName){
        System.out.printf("Your new car named %s is on the garage now.\n",carName);
    }
    public static void printSellCar(String carName){
        System.out.printf("%s is sold. Your balance: %s\n",carName,MyCar.money);
    }

}
