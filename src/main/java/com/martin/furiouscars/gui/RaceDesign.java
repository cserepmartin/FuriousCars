package com.martin.furiouscars.gui;

import com.martin.furiouscars.methods.Garage;
import com.martin.furiouscars.methods.Race;
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

    public void raceMenu(FirstGarage firstGarage,Scanner scanner,Money money,Garage garage) throws ParserConfigurationException, SAXException, IOException {

        boolean notQuit = true;
        while (notQuit){
            boolean inWhile = true;
            int index;
            String carName = null;
                while (inWhile) {
                    System.out.println("Select a car to race: ");
                    scanner.nextLine();
                    carName = scanner.nextLine();
                    if(garage.findCarByName(firstGarage.cars,carName)==null){
                        System.out.printf("Car named %s does not exist!", carName);
                    } else {
                        MyCar myCar = garage.findCarByName(firstGarage.cars, carName);
                        inWhile = false;
                    }
                }
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
                    if(money.money<300) {
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        Race dragRace = new Race() {
                            @Override
                            public int WhoIsTheWinner(Integer result) {
                                return super.WhoIsTheWinner(result);
                            }
                        };
                        int result = dragRace.WhoIsTheWinner(dragRace.DragRace(carName,firstGarage,money));
                        printRaceResult(result,money);
                    }
                    break;
                case 2:
                    if(money.money<100) {
                        System.out.println("Sorry, but you don't have enough money for this!");
                    } else {
                        VisualRace visualRace = new VisualRace();
                        printVRaceResult(visualRace.vRace(visualRace.booleanGenerator(),money),money);
                    }
                    break;
                default:
                    System.out.println("Please type a correct number!");
            }
        }
    }
    public void printRaceResult(Integer result,Money money){
        if(result == 1){
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", money.money);
        } else if(result == 2){
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", money.money);
        } else if(result == 3){
            System.out.println("It's a draw!");
        }
    }
    public void printVRaceResult(boolean result,Money money) {

        if (result) {
            System.out.println("You win!");
            System.out.printf("Current balance: $%s\n", money.money);
        } else {
            System.out.println("You lose!");
            System.out.printf("Current balance: $%s\n", money.money);
        }
    }
}
