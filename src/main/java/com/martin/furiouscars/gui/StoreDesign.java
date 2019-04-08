package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StoreDesign {
    Scanner scanner;
    public void storeDesign(Garage firstGarage, Money money, Scanner scanner) throws IOException, SAXException, ParserConfigurationException {
        boolean notQuit = true;
        Garage garage = new Garage();
        while (notQuit){
            boolean inWhile = true;
            String carName = null;
            while (inWhile) {
                System.out.println("Select a car to upgrade: ");
                scanner.nextLine();
                carName = scanner.nextLine();
                if (garage.findCarByName(firstGarage.cars, carName) == null) {
                    System.out.printf("Car named %s does not exist!", carName);
                } else {
                    MyCar myCar = garage.findCarByName(firstGarage.cars, carName);
                    inWhile = false;
                }
            }
            int choice;
            Store store = new Store();
            System.out.println("     ____________________");
            System.out.println("     |                  |");
            System.out.println("     |       Store      |");
            System.out.println("     |__________________|");
            System.out.println("          0. Leave");
            System.out.println("      1. Engine upgrade\n");
            System.out.print("Choose an option: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please type an integer: " + e.getMessage());
                continue;
            }
            switch (choice) {
                case 0:
                    System.out.println("Thanks for visiting us!");
                    notQuit = false;
                    break;
                case 1:
                    printEningeResult(store.EngineUpgrade(carName,money,garage),carName,firstGarage);
                    break;

                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public void printEningeResult(Integer result, String carName, Garage firstGarage){
        Garage garage = new Garage();
        MyCar myCar = garage.findCarByName(firstGarage.cars,carName);
        if(result == 0){
            System.out.println("Sorry, but you don't have enough money for this!");
        } else if(result == 1){
            System.out.printf("%s's engine is upgraded to level %s\n",myCar.getCarName(),myCar.getEngine());
        } else if(result == 2){
            System.out.println("You already reached the maximum engine level! Congrats!");
        }
    }

}
