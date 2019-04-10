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
import java.util.SortedMap;

public class RaceDesign {
    Scanner scanner;

    public void raceMenu(Scanner scanner, RaceModelling raceModelling) throws ParserConfigurationException, SAXException, IOException {
        String garageName = null;
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
                        garageName = scanner.nextLine();
                        if(raceModelling.garageIsExist(garageName)){
                            Garage garage = raceModelling.findByName(garageName);
                            carName = scanner.nextLine();
                            if(garage.carIsExists(carName)){
                                System.out.printf("Car named %s does not exist!", carName);
                            } else {
                                inWhile = false;
                            }
                        }
                    }
                    try {
                        printRaceResult(raceModelling.race(RaceType.Drag, garageName, carName),raceModelling);
                    } catch (OutOfMoneyException e) {
                        e.printStackTrace();
                    } catch (RaceModellingException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    while (inWhile) {
                        System.out.println("Select a garage: ");
                        scanner.nextLine();
                        garageName = scanner.nextLine();
                        if(raceModelling.garageIsExist(garageName)){
                            Garage garage = raceModelling.findByName(garageName);
                            carName = scanner.nextLine();
                            if(garage.carIsExists(carName)){
                                System.out.printf("Car named %s does not exist!", carName);
                            } else {
                                inWhile = false;
                            }
                        }
                    }
                    try {
                        printRaceResult(raceModelling.race(RaceType.Visual, garageName, carName),raceModelling);
                    } catch (OutOfMoneyException e) {
                        System.out.println(e.getMessage());
                    } catch (RaceModellingException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }

    public void printRaceResult(Integer result,RaceModelling raceModelling){
        if(result == 0){
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", raceModelling.getMoney());
        } else if(result == 1){
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", raceModelling.getMoney());
        } else if(result == 2){
            System.out.println("It's a draw!");
        }
    }

}
