package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.MyCar;
import com.martin.furiouscars.methods.VisualRace;
import com.martin.furiouscars.methods.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RaceDesign {
    Scanner scanner;

    public void raceMenu(Garage firstGarage, Scanner scanner, Money money, Garage garage, RaceModelling raceModelling) throws ParserConfigurationException, SAXException, IOException {

        boolean notQuit = true;
        while (notQuit){
            boolean inWhile = true;
            int index;
            String carName = null;
            int choice;
            System.out.println("     ___________________");
            System.out.println("     |                 |");
            System.out.println("     |       Race      |");
            System.out.println("     |_________________|");
            System.out.println("          0. Leave");
            System.out.println("        1. Drag Race");
            System.out.println("       2. Visual Race\n");
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
                    while (inWhile) {
                        System.out.println("Select a garage: ");
                        scanner.nextLine();
                        String garageName = scanner.nextLine();
                        if(raceModelling.garages.containsKey(garageName)){
                            if(garage.findCarByName(raceModelling,carName)==null){
                                System.out.printf("Car named %s does not exist!", carName);
                            } else {
                                MyCar myCar = garage.findCarByName(raceModelling, carName);
                                inWhile = false;
                            }
                        }
                    }
                        DragRace dragRace = new DragRace();
                    try {
                        printRaceResult(dragRace.WhoIsTheWinner(carName,firstGarage,raceModelling),money);
                    } catch (OutOfMoneyException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:

                    while (inWhile) {
                        System.out.println("Select a car to race: ");
                        scanner.nextLine();
                        carName = scanner.nextLine();
                        if(garage.findCarByName(raceModelling,carName)==null){
                            System.out.printf("Car named %s does not exist!", carName);
                        } else {
                            MyCar myCar = garage.findCarByName(raceModelling, carName);
                            inWhile = false;
                        }
                    }
                        VisualRace visualRace = new VisualRace();
                    try {
                        printVRaceResult(visualRace.WhoIsTheWinner(carName,firstGarage,raceModelling),money);
                    } catch (OutOfMoneyException e) {
                        System.out.printf("Error: %s\n",e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public void printRaceResult(Integer result,Money money){
        if(result == 0){
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", money.money);
        } else if(result == 1){
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", money.money);
        } else if(result == 2){
            System.out.println("It's a draw!");
        }
    }
    public void printVRaceResult(Integer result,Money money) {

        if (result == 0) {
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", money.money);
        } else if (result == 1){
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", money.money);
        }
    }
}
