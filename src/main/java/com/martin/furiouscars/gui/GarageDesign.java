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

                    break;
                case 2:

                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public static void printBuyCar(Integer result){

    }
    public static void printSellCar(Integer result){

    }

}
